package es.uniovi.dlp.visitor.codegeneration;


import java.io.IOException;
import java.io.OutputStreamWriter;

public class CodeGenerator {
    private OutputStreamWriter out;

    public CodeGenerator(OutputStreamWriter out) {
        this.out = out;
    }

    public void source(String constant) throws IOException {
        out.write("\t#source " + constant);
        out.flush();
    }

    public void line(int constant) throws IOException {
        out.write("\t#line " + constant);
        out.flush();
    }

    public void pushb(char c) throws IOException {
        out.write("\tpushb\t" + c);
        out.flush();
    }

    public void pushi(int i) throws IOException {
        out.write("\tpushi\t" + i);
        out.flush();
    }

    public void pushf(double f) throws IOException {
        out.write("\tpushf\t" + f);
        out.flush();
    }

    public void pusha(int i) throws IOException {
        out.write("\tpusha\t" + i);
        out.flush();
    }

    public void pushBp() throws IOException {
        out.write("\tpush\tbp");
        out.flush();
    }

    public void load(String type) throws IOException {
        out.write("\tload" + type);
        out.flush();
    }

    public void store(String type) throws IOException {
        out.write("\tstore" + type);
        out.flush();
    }

    public void pop(String type) throws IOException {
        out.write("\tpop" + type);
        out.flush();
    }

    public void dup(String type) throws IOException {
        out.write("\tdup" + type);
        out.flush();
    }

    public void b2i() throws IOException {
        out.write("\tb2i");
        out.flush();
    }

    public void i2f() throws IOException {
        out.write("\ti2f");
        out.flush();
    }

    public void f2i() throws IOException {
        out.write("\tf2i");
        out.flush();
    }

    public void i2b() throws IOException {
        out.write("\ti2b");
        out.flush();
    }

    public void outb(byte b) throws IOException {
        out.write("\toutb" + b);
        out.flush();
    }

    public void outi(int i) throws IOException {
        out.write("\touti" + i);
        out.flush();
    }

    public void outf(float f) throws IOException {
        out.write("\toutf" + f);
        out.flush();
    }

    public void inb(byte b) throws IOException {
        out.write("\tinb" + b);
        out.flush();
    }

    public void ini(int i) throws IOException {
        out.write("\tini" + i);
        out.flush();
    }

    public void inf(float f) throws IOException {
        out.write("\tinf" + f);
        out.flush();
    }

    public void jmp(int label) throws IOException {
        out.write("\tjmp" + label);
        out.flush();
    }

    public void jz(int label) throws IOException {
        out.write("\tjmp" + label);
        out.flush();
    }

    public void jnz(int label) throws IOException {
        out.write("\tjmp" + label);
        out.flush();
    }

    public void halt() throws IOException {
        out.write("\thalt\n");
        out.flush();
    }

    public void call(String etiqueta) throws IOException {
        out.write("\tcall " + etiqueta);
        out.flush();
    }


    public void enter(int i) throws IOException {
        out.write("\tenter " + i);
        out.flush();
    }

    public void ret(int retBytes, int retVar, int retPar) throws IOException {
        out.write("\tret " + retBytes + "," + retVar + "," + retPar);
        out.flush();
    }

    public void add(String type) throws IOException {
        out.write("\tadd" + type);
        out.flush();
    }

    public void sub(String type) throws IOException {
        out.write("\tsub" + type);
        out.flush();
    }

    public void div(String type) throws IOException {
        out.write("\tdiv" + type);
        out.flush();
    }

    public void mul(String type) throws IOException {
        out.write("\tmul" + type);
        out.flush();
    }

    public void mod(String type) throws IOException {
        out.write("\tmod" + type);
        out.flush();
    }

    public void gt(String type) throws IOException {
        out.write("\tgt" + type);
        out.flush();
    }

    public void lt(String type) throws IOException {
        out.write("\tlt" + type);
        out.flush();
    }

    public void ge(String type) throws IOException {
        out.write("\tge" + type);
        out.flush();
    }

    public void le(String type) throws IOException {
        out.write("\tle" + type);
        out.flush();
    }

    public void eq(String type) throws IOException {
        out.write("\teq" + type);
        out.flush();
    }

    public void ne(String type) throws IOException {
        out.write("\tne" + type);
        out.flush();
    }

    public void and() throws IOException {
        out.write("\tand");
        out.flush();
    }

    public void or() throws IOException {
        out.write("\tor");
        out.flush();
    }

    public void not() throws IOException {
        out.write("\tnot");
        out.flush();
    }

    public void logic(String operator) throws IOException {
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

    public void arithmetic(String operator, String type) throws IOException {
        switch (operator) {
            case "+":
                add(type);
                break;
            case "-":
                sub(type);
                break;
            case "*":
                div(type);
                break;
            case "/":
                mul(type);
                break;
            case "%":
                mod(type);
                break;
            default:
                break;
        }
    }

    public void comparison(String operator, String type) throws IOException {
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

}
