protected void createContents() {
   shlResourceDemo = new Shell();
   shlResourceDemo.setSize(336, 249);
   shlResourceDemo.setText("Resource Demo");
   shlResourceDemo.setLayout(new RowLayout(SWT.HORIZONTAL));
   
   Button btnButtonU = new Button(shlResourceDemo, SWT.NONE);
   btnButtonU.setFont(SWTResourceManager.getFont("Arial", 12, SWT.NORMAL));
   btnButtonU.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
   btnButtonU.setImage(SWTResourceManager.getImage(ResourceDemo.class, "/org/o7planning/tutorial/jface/image/check.png"));
   btnButtonU.setText("Button using SWT Resource Manager");
}
