package uk.ac.bbk.dcs.jsted02.utils

class UsefulFunctions{
    static def read(String prompt){
        print prompt
        java.util.Scanner sc = new java.util.Scanner(System.in)
        return sc.next()
    }

    static def readln(String prompt){
        print prompt
        java.util.Scanner sc = new java.util.Scanner(System.in)
        return sc.nextLine()
    }
}


