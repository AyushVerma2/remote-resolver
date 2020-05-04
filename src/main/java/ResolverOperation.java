import sg.dex.starfish.dexchain.DexResolver;
import sg.dex.starfish.util.DID;
import org.json.simple.JSONObject;

public class ResolverOperation {

    public static void main(String[] args) {
        DID did = DID.parse(args[0].toString());
        DexResolver default_resolver = (DexResolver)DexResolver.create();
        String ddoString = default_resolver.getDDOString(did);
        JSONObject ddo = new JSONObject();
        ddo.put("ddo", ddoString);
        System.out.println(ddo.toJSONString());
    }
}