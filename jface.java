protected void createContents() {
   shlResourceDemo = new Shell();
   shlResourceDemo.setSize(336, 249);
   shlResourceDemo.setText("Resource Demo");
   shlResourceDemo.setLayout(new RowLayout(SWT.HORIZONTAL));
   
   Button btnButtonU = new Button(shlResourceDemo, SWT.NONE);
   btnButtonU.setFont(SWTResourceManager.getFont("Arial", 12, SWT.NORMAL));
   btnButtonU.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));  
   btnButtonU.setText("Button using SWT Resource Manager");
}


##############################################################################################
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

public class ResourceDemo {

   protected Shell shlResourceDemo;

   /**
    * Launch the application.
    *
    * @param args
    */
   public static void main(String[] args) {
       try {
           ResourceDemo window = new ResourceDemo();
           window.open();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   /**
    * Open the window.
    */
   public void open() {
       Display display = Display.getDefault();
       createContents();
       shlResourceDemo.open();
       shlResourceDemo.layout();
       while (!shlResourceDemo.isDisposed()) {
           if (!display.readAndDispatch()) {
               display.sleep();
           }
       }
   }

   /**
    * Create contents of the window.
    */
   protected void createContents() {
       shlResourceDemo = new Shell();
       shlResourceDemo.setSize(336, 249);
       shlResourceDemo.setText("Resource Demo");
       shlResourceDemo.setLayout(new RowLayout(SWT.HORIZONTAL));

       Button btnButtonU = new Button(shlResourceDemo, SWT.NONE);
       btnButtonU.setFont(SWTResourceManager.getFont("Arial", 12, SWT.NORMAL));
       btnButtonU.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
       
       btnButtonU.setText("Button using SWT Resource Manager");

     

       Button button2 = new Button(shlResourceDemo, SWT.NONE);
       button2.setText("Button using JFace Resource Manager");

       LocalResourceManager jfaceRsManager = new LocalResourceManager(
               JFaceResources.getResources(), shlResourceDemo);

      
       Color color = jfaceRsManager.createColor(new RGB(200, 100, 0));
       Font font = jfaceRsManager.createFont(FontDescriptor.createFrom(
               "Arial", 10, SWT.BOLD));
      
       ImageDescriptor imageDescriptor = ImageDescriptor.createFromFile(ResourceDemo.class,"check.png");
       Image image = jfaceRsManager.createImage(imageDescriptor);

       button2.setFont(font);
       button2.setForeground(color);
       button2.setImage(image);
   }
}
####################################################################################
public static List<AppMenu> getAppMenus() {
      if (appMenuList == null) {
          appMenuList = new ArrayList<AppMenu>();

          AppMenu appMenu31 = new AppMenu("ErrorLog", "Error Log", null);
          AppMenu appMenu32 = new AppMenu("ProjectExplorer",
                  "Project Explorer", null);

          List<AppMenu> list3 = new ArrayList<AppMenu>();
          list3.add(appMenu31);
          list3.add(appMenu32);

          AppMenu appMenu21 = new AppMenu("ShowView", "Show View", list3);
          AppMenu appMenu22 = new AppMenu("ClosePerspective",
                  "Close perspective...", null);
          List<AppMenu> list2 = new ArrayList<AppMenu>();
          list2.add(appMenu21);
          list2.add(appMenu22);

          AppMenu appMenu1 = new AppMenu("Window", "Window", list2);

          appMenuList.add(appMenu1);
      }
      return appMenuList;
  }
  
######################################################################################
