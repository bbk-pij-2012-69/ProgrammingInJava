package lecture01

// Example 3 - 10 times loop, reading inputs
String str = System.console().readLine()
int i = Integer.parseInt(str)
while(i < 10) {
    i++
    String str2 = System.console().readLine()
    int j = Integer.parseInt(str2)
    if (j == 0)
        break;
    else if (j != 1)
        println j;
    
}
println "finished"
