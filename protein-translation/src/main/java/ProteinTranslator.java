import java.util.*;

class ProteinTranslator {
    Map<String, String> translation = new HashMap<String, String>() {{
        put("AUG", "Methionine");
        put("UUU", "Phenylalanine");
        put("UUC", "Phenylalanine");
        put("UUA", "Leucine");
        put("UUG", "Leucine");
        put("UCU", "Serine");
        put("UCC", "Serine");
        put("UCA", "Serine");
        put("UCG", "Serine");
        put("UAU", "Tyrosine");
        put("UAC", "Tyrosine");
        put("UGU", "Cysteine");
        put("UGC", "Cysteine");
        put("UGG", "Tryptophan");
        put("UAA", "STOP");
        put("UAG", "STOP");
        put("UGA", "STOP");
    }};

    List<String> translate(String rnaSequence) {
        List<String> proteins = new LinkedList<>();
        for(int i=0;i < rnaSequence.length();i+=3) {
            String protein = translation.get(rnaSequence.substring(i, i+3));
            if (protein.equals("STOP"))
                break;
            else {
                proteins.add(protein);
            }
        }
        return proteins;
    }
}