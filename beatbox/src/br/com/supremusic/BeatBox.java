package br.com.supremusic;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.SeparatorUI;

public class BeatBox {

	private JPanel panel;
	private ArrayList<JCheckBox> checkboxList;
	private Sequencer sequencer;
	private Track track;
	private JFrame frame;

	private String[] instrumentNames = { "Bass Drum", "Closed Hi-Hart", "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal",
			"Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap",
			"Low-mid Tom", "High Agogo", "Open Hi-Conga" };

	private int[] instruments = { 35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63, };
	private Sequence sequence;

	public static void main(String[] args) {
		new BeatBox().buildGUI();
	}

	private void buildGUI() {
		frame = new JFrame("BeatBox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout layout = new BorderLayout();
		JPanel background = new JPanel(layout);
		background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		checkboxList = new ArrayList<>();
		Box buttonBox = new Box(BoxLayout.Y_AXIS);

		JButton start = new JButton("Start");
		start.addActionListener(new MyStartListener());
		buttonBox.add(start);

		JButton stop = new JButton("Stop");
		stop.addActionListener(new MyStopListener());
		buttonBox.add(stop);

		JButton upTempo = new JButton("Up Tempo");
		upTempo.addActionListener(new MyUpTempoListener());
		buttonBox.add(upTempo);

		JButton downTempo = new JButton("Down Tempo");
		downTempo.addActionListener(new MyDownTempoListener());
		buttonBox.add(downTempo);

		Box nameBox = new Box(BoxLayout.Y_AXIS);
		for (int i = 0; i < 16; i++) {
			nameBox.add(new Label(instrumentNames[i]));

		}
		background.add(BorderLayout.EAST, buttonBox);
		background.add(BorderLayout.WEST, nameBox);

		frame.getContentPane().add(background);

		GridLayout grid = new GridLayout(16, 16);
		grid.setVgap(1);
		grid.setHgap(2);
		panel = new JPanel(grid);
		background.add(BorderLayout.CENTER, panel);

		for (int i = 0; i < 256; i++) {
			JCheckBox checkBox = new JCheckBox();
			checkBox.setSelected(false);
			checkboxList.add(checkBox);
			panel.add(checkBox);

		}

		setUpMIdi();

		frame.setBounds(50, 50, 300, 300);
		frame.pack();
		frame.setVisible(true);

	}

	private void setUpMIdi() {

		try {
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequence = new Sequence(Sequence.PPQ, 4);
			track = sequence.createTrack();
			sequencer.setTempoInBPM(120);

		} catch (MidiUnavailableException e) {
			e.printStackTrace();
			System.out.println("Nao achou o midi");
		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
			System.out.println("Midi esta invalido");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ferrou ...");
		}

	}

	public void buildTrackAndStart() {
		int[] trackList = null;

		sequence.deleteTrack(track);

		track = sequence.createTrack();

		for (int i = 0; i < 16; i++) {
			trackList = new int[16];
			int key = instruments[i];
			for (int j = 0; j < 16; j++) {
				JCheckBox checkBox = (JCheckBox) checkboxList.get(j + (16 * i));
				if (checkBox.isSelected()) {
					trackList[j] = key;
				} else {
					trackList[j] = 0;
				}

			}
			makeTracks(trackList);
			track.add(makeEvent(176, 1, 127, 0, 16));

		}
        track.add(makeEvent(192,9,1,0,15));
        try {
		sequencer.setSequence(sequence);
		sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
	    sequencer.start();
	    sequencer.setTempoInBPM(120);
        } catch (Exception e) {
        	e.printStackTrace();
        }

	}     
	private MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;

		try {

			ShortMessage message = new ShortMessage();
			message.setMessage(comd, chan, one, two);
			event = new MidiEvent(message, tick);

		} catch (InvalidMidiDataException e) {
			e.printStackTrace();
		}

		return event;
	}

	private void makeTracks(int[] trackList) {
		for (int i = 0; i < 16; i++) {
			int key = trackList[i];
			if (key != 0) {
				track.add(makeEvent(144, 9, key, 100, i));
				track.add(makeEvent(128, 9, key, 100, i++));
			}
		}
	}

	public class MyStartListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			buildTrackAndStart();
		}
	}

	public class MyStopListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			sequencer.stop();
		}
	}

	public class MyUpTempoListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		float tempoFactor = sequencer.getTempoFactor();
		sequencer.setTempoFactor((float) (tempoFactor * 1.03));
		
	}

}
	public class MyDownTempoListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			float tempoFactor = sequencer.getTempoFactor();
			sequencer.setTempoFactor((float) (tempoFactor * .97));
			
		}

	}


}



