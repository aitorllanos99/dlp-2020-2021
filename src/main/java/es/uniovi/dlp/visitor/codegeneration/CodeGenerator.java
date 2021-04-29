package es.uniovi.dlp.visitor.codegeneration;


import es.uniovi.dlp.ast.types.CharType;
import es.uniovi.dlp.ast.types.DoubleType;
import es.uniovi.dlp.ast.types.IntType;
import es.uniovi.dlp.ast.types.Type;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class CodeGenerator {
    private OutputStreamWriter out;

    public CodeGenerator(OutputStreamWriter out) {
        this.out = out;
    }

    public void source(String constant) {
        try {
            out.write("#source " + constant + "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void line(int constant) {
        try {
            out.write("#line " + constant+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }
    public void push(String type, int n) {
        try {
            out.write("\tpush" + type +"\t" + n+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    } public void push(String type, double n) {
        try {
            out.write("\tpush" + type +"\t" + n+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }


    public void pusha(int i) {
        try {
            out.write("\tpusha\t" + i+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void pushBp() {
        try {
            out.write("\tpush\tbp\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void load(String type) {
        try {
            out.write("\tload" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void store(String type) {
        try {
            out.write("\tstore" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void pop(String type) {
        try {
            out.write("\tpop" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void dup(String type) {
        try {
            out.write("\tdup" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void b2i() {
        try {
            out.write("\tb2i\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void i2f() {
        try {
            out.write("\ti2f\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void f2i() {
        try {
            out.write("\tf2i\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void i2b() {
        try {
            out.write("\ti2b\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void out(String b) {
        try {
            out.write("\tout" + b+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void in(String x) {
        try {
            out.write("\tin" + x+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }


    public void jmp(int label) {
        try {
            out.write("\tjmp\t label" + label+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void jz(int label) {
        try {
            out.write("\tjmp\t label" + label+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void jnz(int label) {
        try {
            out.write("\tjmp" + label+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void halt() {
        try {
            out.write("halt\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void call(String etiqueta) {
        try {
            out.write("call " + etiqueta+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }


    public void enter(int i) {
        try {
            out.write("\tenter " + i+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void ret(int retBytes, int retVar, int retPar) {
        try {
            out.write("\tret " + retBytes + "," + retVar + "," + retPar+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void add(String type) {
        try {
            out.write("\tadd" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void sub(String type) {
        try {
            out.write("\tsub" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void div(String type) {
        try {
            out.write("\tdiv" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void mul(String type) {
        try {
            out.write("\tmul" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void mod(String type) {
        try {
            out.write("\tmod" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void gt(String type) {
        try {
            out.write("\tgt" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void lt(String type) {
        try {
            out.write("\tlt" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void ge(String type) {
        try {
            out.write("\tge" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void le(String type) {
        try {
            out.write("\tle" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void eq(String type) {
        try {
            out.write("\teq" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void ne(String type) {
        try {
            out.write("\tne" + type+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void and() {
        try {
            out.write("\tand\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void or() {
        try {
            out.write("\tor\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void not() {
        try {
            out.write("\tnot\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void logic(String operator) {

        switch (operator) {
            case "&&":
                and();
                break;
            case "||":
                or();
                break;
            case "!":
                not();
                break;
            default:
                break;
        }

    }

    public void arithmetic(String operator, String type) {

        switch (operator) {
            case "+":
                add(type);
                break;
            case "-":
                sub(type);
                break;
            case "*":
                mul(type);
                break;
            case "/":
                div(type);
                break;
            case "%":
                mod(type);
                break;
            default:
                break;
        }

    }

    public void comparison(String operator, String type) {

        switch (operator) {
            case ">":
                gt(type);
                break;
            case "<":
                lt(type);
                break;
            case ">=":
                ge(type);
                break;
            case "<=":
                le(type);
                break;
            case "==":
                eq(type);
                break;
            case "!=":
                ne(type);
                break;
            default:
                break;
        }

    }

    public void id(String name) {
        try {
            out.write(name + ":"+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void comment(String name) {
        try {
            out.write(name+ "\n");
            out.flush();
        } catch (IOException e) {

        }
    }

    public void promoteTo(Type left, Type right) {
        if (left instanceof CharType) {
            if (right instanceof DoubleType) {
                b2i();
                i2f();
            }
            if (right instanceof IntType) b2i();
        }
        if (left instanceof IntType) {
            if (right instanceof DoubleType) i2f();
            if (right instanceof CharType) i2b();
        }
        if (left instanceof DoubleType) {
            if (right instanceof IntType) f2i();
            if (right instanceof CharType) {
                f2i();
                i2b();
            }
        }

    }
}
