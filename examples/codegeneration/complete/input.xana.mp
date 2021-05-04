#source "input.xana"
' i :: int( offset 0 )
' n :: int( offset 2 )
' j :: int( offset 4 )
' c :: char( offset 6 )
' pair :: null( offset 7 )
' matrix :: null( offset 10 )
' Invocation to the p function
call p
#line 10
p:
' Parameters
' Local variables
	enter 0
	ret 0,0,0
' Invocation to the f function
call f
#line 13
f:
' Parameters
' r :: double( offset 4 )
' e :: int( offset 8 )
' Local variables
' real :: double( offset -4 )
' c :: char( offset -5 )
	enter 5
#line 16
	push	bp
	pushf	-4
	addf
	b2i
	i2f
	i2f
	addf
	push	bp
	pushf	4
	addf
	loadf
	addf
	i2f
	addf
	storef
#line 17
	push	bp
	pushb	-5
	addb
	pushb	48
	storeb
	ret 2,5,6
' Invocation to the fill function
call fill
#line 23
fill:
' Parameters
' row :: int( offset 4 )
' value :: int( offset 6 )
' increment :: int( offset 8 )
' Local variables
' i :: int( offset -2 )
' inc :: int( offset -4 )
	enter 4
#line 25
	push	bp
	pushi	-2
	addi
	pushi	0
	storei
#line 26
	push	bp
	pushi	-4
	addi
	push	bp
	pushi	8
	addi
	loadi
	storei
#line 27
' While statement
	lti
	jmp	 label0
label0:
'Body of the while branch
#line 28
	pusha	10
	push	bp
	pushi	4
	addi
	push	bp
	pushi	4
	addi
	loadi
	pushi	20
	muli
	addi
	push	bp
	pushi	-2
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	2
	muli
	addi
	push	bp
	pushi	6
	addi
	loadi
	push	bp
	pushi	-4
	addi
	loadi
	addi
	storei
#line 29
	push	bp
	pushi	-2
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	1
	addi
	storei
#line 30
	push	bp
	pushi	-4
	addi
	push	bp
	pushi	-4
	addi
	loadi
	push	bp
	pushi	8
	addi
	loadi
	addi
	storei
	jmp	 label2
label2:
	ret 0,4,6
' Invocation to the show function
call show
#line 34
show:
' Parameters
' row :: int( offset 4 )
' Local variables
' i :: int( offset -2 )
	enter 2
#line 36
	push	bp
	pushi	-2
	addi
	pushi	0
	storei
#line 37
' While statement
	lti
	jmp	 label4
label4:
'Body of the while branch
#line 38
' Write
	pushb	40
	outb
#line 38
' Write
	push	bp
	pushi	4
	addi
	loadi
	outi
#line 38
' Write
	pushb	44
	outb
#line 38
' Write
	push	bp
	pushi	-2
	addi
	loadi
	outi
#line 38
' Write
	pushb	41
	outb
#line 38
' Write
	pushb	58
	outb
#line 38
' Write
	pusha	10
	push	bp
	pushi	4
	addi
	push	bp
	pushi	4
	addi
	loadi
	pushi	20
	muli
	addi
	push	bp
	pushi	-2
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	2
	muli
	addi
	loadi
	outi
#line 38
' Write
	pushb	32
	outb
#line 39
	push	bp
	pushi	-2
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	1
	addi
	storei
	jmp	 label6
label6:
#line 41
' Write
	pushb	10
	outb
	ret 0,2,2
' Invocation to the main function
call main
halt
#line 44
main:
' Parameters
' Local variables
' i :: int( offset -2 )
	enter 2
#line 47
call p
	popnull
#line 48
	push	bp
	pushi	-2
	addi
	pushi	0
	storei
#line 49
	pusha	7
	pushb	2
	addb
	pushb	48
	storeb
#line 50
	pusha	7
	pushi	0
	addi
	b2i
	storei
#line 51
	i2f
	b2i
call f
	popnull
#line 51
' Write
	i2f
	b2i
call f
	outnull
#line 51
' Write
	pushb	10
	outb
#line 53
	pushf	1.3
	pushi	2
call f
	popnull
#line 55
	push	bp
	pushi	-2
	addi
	pushi	0
	storei
#line 56
	pusha	4
	pushi	0
	storei
#line 57
' While statement
	lti
	jmp	 label8
label8:
'Body of the while branch
#line 58
	push	bp
	pushi	-2
	addi
	loadi
	pusha	4
	loadi
	pushi	1
call fill
	popnull
#line 59
	push	bp
	pushi	-2
	addi
	loadi
call show
	popnull
#line 60
	push	bp
	pushi	-2
	addi
	push	bp
	pushi	-2
	addi
	loadi
	pushi	1
	addi
	storei
#line 61
	pusha	4
	push	bp
	pushi	-2
	addi
	loadi
	pushi	10
	muli
	storei
	jmp	 label10
label10:
	ret 0,2,0
