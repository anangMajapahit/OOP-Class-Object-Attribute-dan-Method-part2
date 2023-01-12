/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burung;

/**
 *
 * @author UmumPRT
 */
class Burung extends kehidupan {
    Burung garuda = new Burung();
    burung("",int hp);
    void walk(){
        System.out.println("Burung berjalan");
    }
    void jump(){
        System.out.println("Burung loncat-loncat");
    }
    void fly(){
        System.out.println("Burung Terbang...");
    }
}
    class manusia extends kehidupan {
    void walk(){
        System.out.println("Zombie jalan-jalan");
    }
}
    class kanggoru extends kehidupan {
    void jump(){
        System.out.println("loncat-loncat!");
    }
}

