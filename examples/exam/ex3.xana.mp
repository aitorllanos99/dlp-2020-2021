#source "ex3.xana"
' c :: [5 :: char]( offset 0 )
' Invocation to the main function
call main
halt
#line 2
main:
' Parameters
' Local variables
	enter 0
#line 3
	pusha	0
	pushi	0
	pushi	1
	muli
	addi
	pushb	65
	storeb
#line 4
	pusha	0
	pushi	1
	pushi	1
	muli
	addi
	pushb	105
	storeb
#line 5
	pusha	0
	pushi	2
	pushi	1
	muli
	addi
	pushb	116
	storeb
#line 6
	pusha	0
	pushi	3
	pushi	1
	muli
	addi
	pushb	111
	storeb
#line 7
	pusha	0
	pushi	4
	pushi	1
	muli
	addi
	pushb	114
	storeb
#line 9
' Write
	pusha	0
	pushi	0
	pushi	1
	muli
	addi
	loadb
	outb
	pusha	0
	pushi	1
	pushi	1
	muli
	addi
	loadb
	outb
	pusha	0
	pushi	2
	pushi	1
	muli
	addi
	loadb
	outb
	pusha	0
	pushi	3
	pushi	1
	muli
	addi
	loadb
	outb
	pusha	0
	pushi	4
	pushi	1
	muli
	addi
	loadb
	outb
	ret 0,0,0
