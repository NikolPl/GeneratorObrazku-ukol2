package cz.czechitas.webapp;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class HlavniController {

    @RequestMapping("/")
    public ModelAndView zobrazMeme(){

        List<String> vyroky = new ArrayList<String>();
        vyroky.add("Mládí není období života, ale duševní stav. (Johann Wolfgang von Goethe)");
        vyroky.add("Není pravda, že máme málo času, pravdou ale je, že ho hodně promarníme. (Seneca)");
        vyroky.add("Když něco opravdu chceš, celý vesmír se spojí, abys to mohl uskutečnit. (Paulo Coellho)");
        vyroky.add("Žij, jako bys měl zítra zemřít. Uč se, jako bys měl navždy žít. (Mahátma Gándhí)");
        vyroky.add("Budete-li se snažit porozumět celému vesmíru, nepochopíte vůbec nic. Jestliže se pokusíte porozumět sobě, pochopíte celý vesmír. (Buddha)");
        vyroky.add("První krok proto, abyste od života získali to, co chcete je rozhodnout se, co to je. (Ben Stein)");
        vyroky.add("Představivost je důležitější než vědomosti. (Albert Einstein)");

        Random cislo = new Random();
        int nahodneCislo = cislo.nextInt(vyroky.size());

        ModelAndView meme = new ModelAndView("index");
        meme.addObject("vyrok", vyroky.get(nahodneCislo));

        Random cislo2 = new Random();
        int nahodneCislo2 = cislo2.nextInt(5);
        meme.addObject("cisloObrazku", nahodneCislo2);

        meme.addObject("citaty",vyroky);

        return meme;
    }

}
