package groovy_acts

class Example {
	static void main(args) {
		//5.times { println "Times + $it " }
		/*5.times {println "Times + $it "}
		
		1.upto(4) { println it }
		3.downto(0) {  println it}
		
		def sum = 0
		1.upto(100) {sum += it}
		println "Sum = " + sum*/
		
		def name = "John"
		def s1 = "Hello $name" // $name will be replaced
		def s2 = 'Hello $name' // $name will not be replaced
		println s1
		println s2
		
		println s1.getClass();
		
		def date = new Date()
		println "We met at $date"
		
		println 'ABCDEF'.substring(1)           // output: BCDEF
	}
}
