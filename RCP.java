   public void preWindowOpen() {
       IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
       configurer.setInitialSize(new Point(400, 300));
       
       // Show MenuBar
       configurer.setShowMenuBar(true);
       // Show CoolBar.
       configurer.setShowCoolBar(true);
       // Show Status Line.
       configurer.setShowStatusLine(true);
       // Show PerspectiveBar
       configurer.setShowPerspectiveBar(true);
       // Show FastViewBars
       configurer.setShowFastViewBars(true);
       // Show ProgressIndicator
       configurer.setShowProgressIndicator(true);
       
       configurer.setTitle("Hello RCP"); //$NON-NLS-1$
   }
