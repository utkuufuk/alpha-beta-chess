package com.example.chess.app.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ChessBoardPart 
{
	private Label label;

	@PostConstruct
	public void createComposite(Composite parent) 
	{
		parent.setLayout(new GridLayout(1, false));

		label = new Label(parent, SWT.BORDER | SWT.BOLD);
		label.setText("Hello!");
//		labels.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}

	@Focus
	public void setFocus() 
	{
	
	}
}