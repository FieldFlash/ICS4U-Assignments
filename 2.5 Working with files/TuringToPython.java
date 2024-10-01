import javax.swing.JFileChooser;

public class TuringToPython {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.showOpenDialog(null);
        System.out.println(chooser.getSelectedFile().getAbsolutePath());
    }
}
