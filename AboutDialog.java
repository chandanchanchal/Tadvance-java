import org.eclipse.swt.SWT;

public class AboutDialog extends Dialog {

   protected Object result;
   protected Shell shlAbout;

   /**
    * Create the dialog.
    * @param parent
    * @param style
    */
   public AboutDialog(Shell parent, int style) {
       super(parent, style);
       setText("SWT Dialog");  
   }

   /**
    * Open the dialog.
    * @return the result
    */
   public Object open() {
       createContents();
       shlAbout.open();
       shlAbout.layout();
       Display display = getParent().getDisplay();
       while (!shlAbout.isDisposed()) {
           if (!display.readAndDispatch()) {
               display.sleep();
           }
       }
       return result;
   }

   /**
    * Create contents of the dialog.
    */
   private void createContents() {
       shlAbout = new Shell(getParent(), getStyle());
       shlAbout.setSize(418, 145);
       shlAbout.setText("About");
       shlAbout.setLayout(new GridLayout(1, false));
       
       Label lblNewLabel = new Label(shlAbout, SWT.NONE);
       lblNewLabel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true, 1, 1));
       lblNewLabel.setText("RCP Tutorial");

   }

}
