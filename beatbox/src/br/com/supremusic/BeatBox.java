package br.com.supremusic;

import java.awt.BorderLayout;
import java.awt.Label;
import java.util.ArrayList;

import javax.sound.midi.Sequencer;
import javax.sound.midi.Track;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BeatBox {

	private JPanel panel;
	private ArrayList<JCheckBox> checkboxList;
	private Sequencer sequencer;
	private Track track;
	private JFrame frame;

	private String[] instrumentNames = { "Bass Drum", "Closed Hi-Hart", "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal",
			"Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", "Vibraslap",
			"Low-mid Tom", "High Agogo", "Open Hi-Conga" };

	private int[] instruments = {
    	35, 42, 46, 38, 49, 39, 50, 60, 70,
    	72, 64, 56, 58, 47,	67,	63,       		 		 
     };

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
	    Box buttonBox = new Box(BoxLayout.LINE_AXIS);
	
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
        
        
        
        
        
	}
	
	
	
}
