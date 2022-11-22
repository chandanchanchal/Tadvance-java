import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class AboutHandler {
   
   @Execute
   public void execute(Shell shell) {
       MessageDialog.openInformation(shell, "About", "Eclipse 4 RCP Application");
   }
}
OpenHandler.java

package org.o7planning.tutorial.rcp.handler;

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
