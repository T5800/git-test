class Person {
	def name
	def age
}
def  list =  [new Person(name:"T5800",age:24)
		new Person(name:"whao",age:12)]
def isNotNull = {
	str, Closure closure ->
	if(str != null ) {
		closure.call()
	}
}
isNotNull("yes") {
	println "hello, groovy"
}
println "add"
println "hello, git"
//wonderful world
println "local2"
