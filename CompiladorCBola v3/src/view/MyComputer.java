package view;

import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

public class MyComputer{
  public static void main(String[] args) {
  JFrame frame = new JFrame("MultSelect");
  DefaultMutableTreeNode myComputer = new DefaultMutableTreeNode("Maquina");
  DefaultMutableTreeNode c = new DefaultMutableTreeNode("C:");
  DefaultMutableTreeNode a = new DefaultMutableTreeNode("3½ Floppy(A:)");
  DefaultMutableTreeNode e = new DefaultMutableTreeNode("New Volume(E:)");
  myComputer.add(c);
  myComputer.add(a);
  myComputer.add(e);
  JTree tree = new JTree(myComputer);
  tree.getSelectionModel().setSelectionMode(TreeSelectionModel.CONTIGUOUS_TREE_SELECTION);
  frame.add(tree);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setUndecorated(true);
  frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
  frame.setSize(200,200);
  frame.setVisible(true);
  }
}