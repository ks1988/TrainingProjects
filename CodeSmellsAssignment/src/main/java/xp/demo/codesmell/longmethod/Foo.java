package xp.demo.codesmell.longmethod;

/**
 * pringOwning method taken from Refactoring by Martin Fowler
 */

import java.util.Enumeration;
import java.util.Vector;

public class Foo {

    private String _name = "bar";
    private Vector<Order> _orders = new Vector<Order>();

    public void printOwing() {

        System.out.println("***************************");
        System.out.println("****** Customer Owes ******");
        System.out.println("***************************");

        System.out.println("Name: " + _name);

        Enumeration orders = _orders.elements();
        double outStanding = 0.0;
        while (orders.hasMoreElements()) {
            Order order = (Order) orders.nextElement();
            outStanding += order.getAmount();
        }

        System.out.println("Amount: " + outStanding);
    }

}