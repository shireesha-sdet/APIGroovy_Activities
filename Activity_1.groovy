package groovy_acts

class Activity_1 {
	
	static void main(args) {
	def x;
	int y;
	def arr = [3,4.5,"string",true,x,y]
	
arr.each { println "value is " +it+".Data type is "+it.getClass() }
	}
		
	
}
