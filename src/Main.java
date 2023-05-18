public class Main {
    public static void main(String[] args) {
      HelloSwing form = new HelloSwing();
      form.setContentPane(form.painelPrincipal);
      form.setTitle("Hello panel");
      form.setSize(500,500);
      form.setVisible(true);
    }
}
