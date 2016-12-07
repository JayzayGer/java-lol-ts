package de.project.ts.lol;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class UIEntryPoint {
	
	
	private Shell shell;


	public void start(){
		shell = new Shell(Display.getCurrent());
		shell.setBackgroundMode(SWT.INHERIT_FORCE);
		shell.setLayout(new FillLayout());

		
		createContent();

		shell.open();
		while (!shell.isDisposed()) {
			if (!shell.getDisplay().readAndDispatch()) {
				shell.getDisplay().sleep();
			}
		}
		Display.getCurrent().dispose();
	}
	
	
	private void createContent(){
		
	}

}
