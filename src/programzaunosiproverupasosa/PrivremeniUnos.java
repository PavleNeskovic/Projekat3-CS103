/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programzaunosiproverupasosa;

/**
 *
 * @author Pavle
 */
public class PrivremeniUnos {
    JavaBinaryTree tree = new JavaBinaryTree();

    public PrivremeniUnos() {
    tree.addNode(9490803, new Osoba("Mile", "Kitic","srb", null, null, null, null, null, null, null, "0803994"));
        System.out.println(tree.findNode(9490803));
    }
    
}
