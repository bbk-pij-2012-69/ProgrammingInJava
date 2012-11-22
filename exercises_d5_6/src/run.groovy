import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader


def boolean guess(target)
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
	print("Enter a coordinate X: ")
	x = br.readLine() as int
	print("Enter a coordinate Y: ")
	y = br.readLine() as int
	print("Enter a coordinate Z: ")
	z = br.readLine() as int
	
	result = target.fire(x,y,z)
	processGuess(result)
	
}

def boolean processGuess(result)
{

	if(result != Result.HIT && result != Result.OUT_OF_RANGE)
		print "You missed! "

	switch(result)
	{
		case Result.HIT:
			println "You hit it! Well done!"
			break
		case Result.OUT_OF_RANGE:
			println "That shot is way out of range. Try harder!"
			break
		case Result.FAIL_LEFT:
			println "The target is to the left!"
			break
		case Result.FAIL_RIGHT:
			println "The target is to the right!"
			break
		case Result.FAIL_HIGH:
			println "The target is higher!"
			break
		case Result.FAIL_LOW:
			println "The target is lower!"
			break
		case Result.FAIL_SHORT:
			println "The target nearer!"
			break
		case Result.FAIL_LONG:
			println "The target father!"
			break
	}
	
	
	return result != Result.HIT
}

// Start of script
target = new Target(10, true)
println "Here they come! Try to bring the plane down!"
running = true
while(running)
{
	running = guess(target)
}

