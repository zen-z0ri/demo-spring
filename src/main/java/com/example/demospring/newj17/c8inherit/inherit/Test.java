package com.example.demospring.newj17.c8inherit.inherit;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test extends MyBase implements Serializable {

    void DerivedStatic() {
        super.BaseMethod();
    }

    static String testSet() {
        return """
                    this si " "  "" "": 
                        mme
                                iyofidsom miejiofdslkm dslflkjsd;lfm;dslfj 
                            sldsjfg;lsda 
                    -----
                    """ + """
                thoshoidf fdsfds""";
    }
    public static void main(String[] args) {
        testSet().lines()
                .forEach(e -> {e += "232";
                    System.out.println(e);});

        var a = Integer.valueOf(1);
        var b = Integer.toString(2);
    }
}
