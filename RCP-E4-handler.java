import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class AboutHandler {
   
   @Execute
   public void execute(Shell shell) {
       MessageDialog.openInformation(shell, "About", "Eclipse 4 RCP Application");
   }
}

######################################################################3
OpenHandler.java



import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class OpenHandler {

   @Execute
   public void execute(Shell shell){
       FileDialog dialog = new FileDialog(shell);
       dialog.open();
   }
}
####################################################
QuitHandler.java



import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;


public class QuitHandler {
   @Execute
   public void execute(IWorkbench workbench, Shell shell){
       if (MessageDialog.openConfirm(shell, "Confirmation",
               "Do you want to exit?")) {
           workbench.close();
       }
   }
}
##########################################################################
SaveHandler.java

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class SaveHandler {

   @CanExecute
   public boolean canExecute(EPartService partService) {
       if (partService != null) {
           return !partService.getDirtyParts().isEmpty();
       }
       return false;
   }

   @Execute
   public void execute(EPartService partService) {
       partService.saveAll(false);
   }
}
