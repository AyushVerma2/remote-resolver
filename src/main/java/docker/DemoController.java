package docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sg.dex.starfish.dexchain.DexResolver;
import sg.dex.starfish.util.DID;
import sg.dex.starfish.util.JSON;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class DemoController {

    public String getDemoData()  {
        DID did = DID.createRandom();

        Map<String, String> test = new HashMap<>();
        test.put("test", "default");
        // register did
        DexResolver default_resolver = (DexResolver) DexResolver.create();
        default_resolver.registerDID(did,
                JSON.toPrettyString(test));
        String ddo = default_resolver.getDDOString(did);
        Map<String, Object> map1 = JSON.toMap(ddo);

        System.out.println(map1.get("test").equals(test.get("test")));
        System.out.println(default_resolver.getDDOString(did));
        return test.get("test") + "DID :" + default_resolver.getDDOString(did);
    }



    @GetMapping
    public String getdefault() throws IOException {
        return  getDemoData();
    }
}

