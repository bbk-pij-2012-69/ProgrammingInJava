package lecture03
java.util.Scanner sc = new java.util.Scanner(System.in);
print "Please enter you string: "
def line = sc.nextLine() as String
StringBuilder stringBuilder

if(line.size() % 2 == 1)
{
    stringBuilder = new StringBuilder(line.substring(0,line.size() - 1))
}
else
{
    stringBuilder = new StringBuilder(line)
}
String reverse = stringBuilder.reverse().toString()
println line + reverse
