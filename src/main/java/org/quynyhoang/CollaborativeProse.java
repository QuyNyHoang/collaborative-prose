package org.quynyhoang;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.examples.SimpleSentence;
import de.htw_berlin.fb4.ossd.prose.Sentence;
import de.htw_berlin.fb4.ossd.prose.Prose;

public class CollaborativeProse {

    public static void main(String[] args) {
       
	  ProseBuilder builder = new ProseBuilder();

	 // Eigene Komponente aus my-prose-app
        builder.register(new com.quynyhoang.SimpleSentence("Dies ist mein eigener Satz."));

        // Elise-Komponente
        builder.register(new de.htw_berlin.fb4.elise.SimpleSentence());

        // Jana-Komponente
         Sentence janaSentence = SimpleSentence.toSentence(() -> "Open Source Test von Jana.");
        builder.register(janaSentence);

        System.out.println(builder.get());
    }
}

