public class HelloSWT {

  public static void main(String[] args) {
      // Create Display
      Display display = new Display();
      // Create Shell (Window) from diplay
      Shell shell = new Shell(display);

      shell.open();

      while (!shell.isDisposed()) {
          if (!display.readAndDispatch())
              display.sleep();
      }
      display.dispose();
  }
}


###################################################################################################################################

public static void main(String[] args) {
	      Display display = new Display();
	      final Shell shell = new Shell(display);
	      shell.setLayout(new FillLayout());

	      //
	      Composite parent = new Composite(shell, SWT.NONE);
	     
	      FillLayout fillLayout= new FillLayout();
	      fillLayout.type= SWT.VERTICAL;
	     
	      parent.setLayout(fillLayout);

	      Button b1 = new Button(parent, SWT.NONE);
	      b1.setText("B1");

	      Button b2 = new Button(parent, SWT.NONE);
	      b2.setText("B2");

	      Button button3 = new Button(parent, SWT.NONE);
	      button3.setText("Button 3");
	     
	      // Windows back to natural size.
	      shell.pack();
	      //
	      shell.open();
	      while (!shell.isDisposed()) {
	          if (!display.readAndDispatch())
	              display.sleep();
	      }
	      // tear down the SWT window
	      display.dispose();
	  }

###################################################################################################################################
