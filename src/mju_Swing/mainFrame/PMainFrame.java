package mju_Swing.mainFrame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import mju_Swing.constants.Constants;
import mju_Swing.valueObject.VUserInfo;

public class PMainFrame extends JFrame {

	private static final long serialVersionUID = 1L; // 버전명
	
	private PMenuBar pMenuBar;
	private PToolBar pToolBar;
	private PMainPanel pMainPanel;
	
	// Constructor
	public PMainFrame() {
		// set attributes
		this.setSize(
				Constants.EMainFrame.WIDTH.getSize(),
				Constants.EMainFrame.HEIGHT.getSize()
				);
		this.setLayout(new BorderLayout()); // Layout Setting
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // X 버튼 누르면 프로그램을 종료해라
		this.setVisible(true);
		
		// create and register components
		this.pMenuBar = new PMenuBar();
		this.setJMenuBar(pMenuBar);
		
		this.pToolBar = new PToolBar();
		this.add(this.pToolBar, BorderLayout.NORTH);
		
		this.pMainPanel = new PMainPanel();
		this.add(this.pMainPanel, BorderLayout.CENTER);
		
	}

}