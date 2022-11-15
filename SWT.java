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

public class TopComposite extends Composite {
  private Text text;

  /**
   * Create the composite.
   * @param parent
   * @param style
   */
  public TopComposite(Composite parent, int style) {
      super(parent, style);
      setLayout(new FillLayout(SWT.HORIZONTAL));
     
      Composite composite = new Composite(this, SWT.NONE);
      composite.setLayout(new GridLayout(1, false));
     
      Button btnPreferredSite = new Button(composite, SWT.CHECK);
      btnPreferredSite.setText("Preferred Site");
     
      Label lblColumnWidth = new Label(composite, SWT.NONE);
      lblColumnWidth.setText("Column width");
     
      text = new Text(composite, SWT.BORDER);
      text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

  }

  @Override
  protected void checkSubclass() {
  }
}

###################################################################################################################

public class BottomComposite extends Composite {
  private Text text;

  /**
   * Create the composite.
   * @param parent
   * @param style
   */
  public BottomComposite(Composite parent, int style) {
      super(parent, style);
      setLayout(new FillLayout(SWT.HORIZONTAL));
     
      Composite composite = new Composite(this, SWT.NONE);
      composite.setLayout(new GridLayout(1, false));
     
      Composite composite_1 = new Composite(composite, SWT.NONE);
      GridLayout gl_composite_1 = new GridLayout(3, false);
      gl_composite_1.marginHeight = 0;
      gl_composite_1.marginWidth = 0;
      composite_1.setLayout(gl_composite_1);
      composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
     
      Button btnNewButton = new Button(composite_1, SWT.NONE);
      btnNewButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
      btnNewButton.setText("Add");
     
      Button btnNewButton_1 = new Button(composite_1, SWT.NONE);
      btnNewButton_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
      btnNewButton_1.setText("Delete");
     
      Button btnNewButton_2 = new Button(composite_1, SWT.NONE);
      btnNewButton_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
      btnNewButton_2.setText("Clear");
     
      text = new Text(composite, SWT.BORDER | SWT.MULTI);
      text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

  }

  @Override
  protected void checkSubclass() {
      // Disable the check that prevents subclassing of SWT components
  }

}


################################################################################################
public class MainComposite extends Composite {

  /**
   * Create the composite.
   * @param parent
   * @param style
   */
  public MainComposite(Composite parent, int style) {
      super(parent, style);
      setLayout(new FillLayout(SWT.HORIZONTAL));
     
      Composite composite = new Composite(this, SWT.NONE);
      composite.setLayout(new GridLayout(1, false));
     
      TopComposite topComposite = new TopComposite(composite, SWT.BORDER);
      topComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
     
      BottomComposite bottomComposite = new BottomComposite(composite, SWT.BORDER);
      bottomComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

  }

  @Override
  protected void checkSubclass() {
  }
  
  
  
  ######################################################################################################################
  
  public class EventTestButton {

  protected Shell shlButtonEventDemo;

  public static void main(String[] args) {
      try {
          EvenTestButton window = new EvenTestButton();
          window.open();
      } catch (Exception e) {
          e.printStackTrace();
      }
  }

  public void open() {
      Display display = Display.getDefault();
      createContents();
      shlButtonEventDemo.open();
      shlButtonEventDemo.layout();
      while (!shlButtonEventDemo.isDisposed()) {
          if (!display.readAndDispatch()) {
              display.sleep();
          }
      }
  }

  protected void createContents() {
      shlButtonEventDemo = new Shell();
      shlButtonEventDemo.setSize(296, 205);
      shlButtonEventDemo.setText("Button Event Demo");
      shlButtonEventDemo.setLayout(new RowLayout(SWT.HORIZONTAL));

      Button btnClickToMe = new Button(shlButtonEventDemo, SWT.NONE);
      btnClickToMe.addSelectionListener(new SelectionAdapter() {
          @Override
          public void widgetSelected(SelectionEvent e) {
              // Handle Button selected here!
              System.out.println("Button selected!");
          }
      });
      btnClickToMe.setText("Click to me");

  }

}

}
########################################################################################################################
