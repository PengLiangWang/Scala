#!/bin/sh
exec scala "$0" "$@"
!#

case class Person(name: String)

object helloworld{
    def main(args: Array[String]){
        require(args.length==1)
        val al = Person(args(0))
        println(al)
    }
}
helloworld.main(args)
