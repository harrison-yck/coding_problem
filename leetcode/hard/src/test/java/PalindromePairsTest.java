import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PalindromePairsTest {

    @Test
    void palindromePairs() {
        assertThat(PalindromePairs.palindromePairs(new String[]{"abcd", "dcba", "lls", "s", "sssll"})).containsExactlyInAnyOrder(List.of(0, 1), List.of(1, 0), List.of(3, 2), List.of(2, 4));
        assertThat(PalindromePairs.palindromePairs(new String[]{"bat", "tab", "cat"})).containsExactlyInAnyOrder(List.of(0, 1), List.of(1, 0));
        assertThat(PalindromePairs.palindromePairs(new String[]{"abcd", "dcba", "lls", "s", "sssll"})).containsExactlyInAnyOrder(List.of(0, 1), List.of(1, 0), List.of(3, 2), List.of(2, 4));
        assertThat(PalindromePairs.palindromePairs(new String[]{"bifccdbgadh", "hcajbajbh", "a", "aebjdcfjcejfdagh", "jgfhigecbccadafjj", "hih", "dcgdjgehcdjbccbgigjh", "ecgaafijgieeeecabg", "ebfcaga", "acjgaj", "jdcdbbfcjdgd", "bgjbfbfhachjeib", "ibfafigcgi", "ibcjdga", "jidbhcedcjjeeibhdcac", "cdbaafeafbba", "hbaadifbaijfe", "ifcdgbdcebdgij", "ehhihic", "adjgbjegfbhjeiajdgd", "h", "ahjjeafggf", "fiei", "bgbddehahjdeehdda", "feeiahdjhhfbhea", "behfgaabfdhedcdia", "eaidc", "jh", "idehjbje", "hcj", "icbghjejje", "gfidhdeihdi", "b", "g", "ggcdafbae", "ffijdb", "ibcjafba", "cbjfa", "ghdafgjjbfegafj", "fc", "dhjifedcgh", "c", "hbaadidfebgchcjj", "diibiagheaihagjhghe", "gj", "caajhii", "bicacgdedgcfbchehhi", "hddbiidbageejdgdbac", "fjbcdghcfjaedig", "bdbhibhhfaidchaihjbf", "ebjefeeh", "hhghidhegjigibfg", "eeiagfhbhgbchcfgicc", "bhgac", "fjhggfideif", "dheg", "igfdiecc", "ihb", "cgfihgedbfee", "fgdifjgdage", "cgjcgicdcibejagife", "ecgcfehj", "gba", "iebdcjjbfagahfa", "gcheg", "bbgdebhei", "bga", "icagijdbjech", "ebcc", "hgabhgfadef", "ddhdddcjbgbeacdihc", "jdehaibebejbaij", "iaajdddiabaffdgcedjc", "edifj", "ihhjdc", "hcdhgicaecjgeh", "aachb", "aifagdbahhcd", "heijhdebc", "jhgga", "fhfggfhgadehijbcg", "bhaeabggfigifde", "fhcjde", "eg", "ddahfcj", "gdjjfehfahbajeijh", "ej", "abgiciejchacf", "hbgabbbcicbhciicah", "fhhj", "jagbefebjadbhffg", "adegfheidghehcbjbj", "gjggdidjaaeha", "gaceacgcaehiibdaajcj", "ceegcgbgg", "bfad", "icdjihajjadfca", "jghhbicbhhgbjegjd", "aebegaacia", "bbgdfehcceh", "fajdh", "ihbedegha", "ci", "jeicaegjjajdjdjba", "fajbhafdcdaf", "ghegebeehdfjhhbb", "cebibdcjh", "bafa", "ajefchd", "dfif", "eihbifaeejaa", "didchefedfbe", "giiigjjijcgeajcjbh", "cjjcieaa", "ehbehiafcciafg", "gdafjdgfddbah", "edifbaei", "giigjdbhggfcbf", "cgjddfaae", "bfide", "ccbfibjgcdeeibbgigj", "hcae", "hhhdhgcj", "chidig", "ihjfihdbijjfacca", "ebcedaadceeja", "dij", "fjjd", "jdbjiib", "fjdgaafaiae", "hfci", "hhjhd", "ijjbifcdde", "jhfgicjahidggjggb", "egfigdafjcaeajjhbjia", "bbadjbafcbc", "ajdeifaefiii", "cggdbjciddibhhd", "ebaegebhhcgehhcdcdaj", "ddhhfdjgfdgfiigccg", "fjeebheeiefaeaiji", "eaghaeihagibfcfhh", "edbjij", "bf", "afjeabe", "jhhgcjd", "igajfgfhdiee", "ccdiffjiiej", "bbbjgfbagag", "badedeaijjhg", "diegi", "jaiaa", "cjbjhdahhgiiaahbide", "hefhahcfbah", "jajfgccheh", "adbadefabafg", "gaifffbebbhigba", "dcahj", "aijjb", "ifdjbheaigfdgd", "gdhbjffiadffdhjejbhf", "ddbjji", "bbhddgcfiah", "jibgc", "iaj", "ehaead", "gigigb", "fffihcdcaddiddi", "jdhigebfefb", "fiecfghjjceaj", "fgeeifcgejcicihhbj", "hgbe", "ajh", "gahhbbgihafhcdf", "dfadbijadabicgcdf", "ejifj", "gejfegdaibjdcihddjab", "fegfehggfjdjejgfd", "afaefbdiggdijiejc", "eefegbafehbcidjcbdi", "fdhehcdjdedide", "egjgajcjah", "j", "dc", "dhhcdcgejaeddbifeieg", "jaecjdeia", "fcfeeb", "ijajhgbbhddefgji", "hebjgj", "ibidiehhfbhhfjieeb", "jahiejafbf", "eeadf", "jabgcagagcch", "ecedhdficfedabaf", "addiahhefgfjgjae", "gaefccch", "dcg", "igbhje", "fb", "hhdjdgjbfhidjfg", "biihgjchgfbiaacjj", "gehfjhbcdchjjigccfjh", "jgegbgccag", "cgbfcfab", "he", "cbgbafcj", "jbecggcfed", "ce", "fdeg", "cghgj", "eiedeejjgbbdeg", "hifbahgafj", "aiifgaeh", "djieiggiaehchcbbebe", "eeghb", "aafhcbjebadgbjhg", "eddbehciaahgidgchfe", "eaegbhhcahdh", "aajebaccbfhfcaa", "ijidfje", "ajgchjjjeagaa", "ia", "gbbjadeeijbbfiehjf", "ehdhhdgagjjdgebfeff", "dgccageehhdbajcehjjg", "hicahhfbafga", "didd", "jgfbcbgfha", "ijebfigbg", "hfjijiedj", "cajadjjfdagbefcd", "hife", "ffbggbgj", "djdgecjahda", "deccbgcg", "iiib", "dfbdcdcehgheibhd", "ibgedgifccjdggcj", "hcghadebddhaedi", "cdehahgh", "f", "hbadjdfeghaf", "ggifcdhdhhgddfigjffe", "eggabbcigfc", "accaijfi", "bgijbgidbahhi", "bajibf", "ifcd", "behfgcfdcfje", "gi", "dbciij", "ecbfde", "aefceaafgj", "gadiegd", "dedcai", "iggadgfdedficic", "ageh", "ehaidg", "eeehfefibeaii", "eihbddghed", "ahbjjibfdigh", "bajedhhbejigggch", "ebjggdbibjgef", "dhgbcfhcaije", "feiejcaeh", "hhfedgdeicbg", "beibcbbjhgfbbche", "cgajffggeddacebhfag", "cgagfgig", "egidbhjfbgdgbfbdde", "bgghig", "fgbbgdgea", "gcjae", "jdabcibhdjijjh", "adedeibeda", "dfbceejibhifcjdhgadi", "fibdeeghd", "cdhafjhbhbficbgg", "jcfa", "jcebbahd", "bfbgdci", "aegab", "edaadfbgfcb", "hacghijbcahbib", "daebfc", "ecfefabjgfbb", "dcbgbjgjihgebaci", "da", "bhicadhb", "ha", "fejgbcggghdafdbba", "gcdajhfghgeifegfeaig", "bfif", "fiejgiffiiibj", "de", "ccbbdgicceec", "hii", "hfafg", "iiibcicabifiibcfagd", "ghaecdhc", "ffeaegccgiejcgbhagh", "igbgfdchhddaagjchc", "gibgbhgjgggfg", "aaacb", "d", "cefaecdeja", "hfccifdffdaeedijgje", "ieefdbdhj", "ajcgahjbcdafgbcfe", "db", "bhefh", "dfjihbfgbjaiijejcd", "ccgiijgfgahac", "fcebadcghchfhccgggbj", "cdffcbheidbjhhahj", "gbjhgeifjig", "ghajifhbebeebhfadde", "igjgjedgffiabba", "bgcf", "ibjg", "ejjdfhb", "efhffdafdegffd", "ceadjigfghbjjbi", "ajdggheihfe", "hhccbabccgeiafcf", "cicaeg", "bfjegjiaaecgfei", "befacfceejfhgf", "bbhbfjhcffjaijgbafai", "gbbicbcjfegjaiig", "fjbgiebjgadg", "iahgaeahjdg", "ffbj", "cef", "aibcaieg", "dhagjiffged", "eibedbcefdbgiijbib", "hfcjbcdbddhiibce", "jbdbjdifbbh", "aicdjjbgacjd", "eijha", "begcgicdbcijeg", "bbdbcjehgce", "hicdie", "hafccdbhbdidff", "hfjjfeih", "cehjhdccfgjijejhgii", "gebdc", "ajhibgichceaigai", "eabacj", "ejdchda", "ibaddd", "fbdjccjihedchgjgbg", "aejhfd", "caefc", "cbajgfj", "hdhgea", "hbgejcdhfaheefe", "bdjehecgdjdfgafhfa", "hdahibbeahgjideijd", "ciiecf", "ddifhb", "cgjjececcb", "bgdce", "beig", "bajfhiaaa", "abaefbejagjeahiebc", "jbccdddifjcd", "e", "hjabdi", "ciedd", "cgdaehachbfe", "ibhgbhchgddcahhjc", "dagdicf", "hjbhcb", "dadidjjgfgbfaa", "jdea", "fbg", "gbicfibbdfhdjhfgadf", "baecfiih", "hebagf", "ifaaichiejic", "ajijfacgfjefj", "ecbggacbgdjhhhgfi", "ccjgcajhhegdjhcbcba", "hidfgiigbiecibibijd", "hdeeebbdaiieehegafie", "fhbhdcbc", "jg", "bjfegbgdeacgifbgca", "hgghd", "dbhbeacfa", "dbdhjgbigegeab", "aeefaiafifb", "fjdeagafagejbcec", "gadijadfc", "hejecd", "bjdgeidigdbfebbcbajd", "ebgdgjhjjbjajjbh", "hgijjiibfabbagi", "gegfiiicg", "hiiaghafgifbbffbeh", "hgdfiidibbdehgie", "hcf", "ccfbbhj", "djj", "gaib", "ddiffbfcaajjjhfaedfi", "aagg", "fafjbdje", "hacafch", "bachc", "gh", "hibgdbgfabihajaagj", "cbhacbajcbicjhh", "bdfcjdfgchagegdj", "aj", "jidjbf", "dffaecag", "hadeafffag", "edgfgbhejd", "fagccfjddaj", "jeebbiigb", "aiacdaedfdfifijhjfia", "jaiihhgdifggefd", "jgfiibjdbeeecgfe", "fegbdchhhhgcjjdeibbj", "gjjiigddiffhbbddeibf", "ihaga", "ahiidfheihiacghdieg", "acjbhg", "gfafiifd", "feided", "bbjcdjd", "egibghdjedidei", "ejihb", "ifheba", "gb", "fcdibica", "egb", "cahbgcgechhjhhic", "begh", "daeidjbifaihgc", "gfjjadcfjigf", "icbigjcjcidfh", "ifdhigfggiffihhhj", "dhjhiahcfdgbjf", "jf", "djcadjgbcbfgidgce", "i", "cb", "dcabaeeciibciedb", "bjfhd", "jcdeifbgfadiidgj", "ejaicdbefgedcei", "echfbjc", "bidbbchb", "bhfdeecgc", "bbfajbjga", "ageecegfaf", "hechcbhhjcgeafcaii", "cchh", "dbhcfjibbeidfc", "gbgahjjiebd", "ejfegjhf", "ahd", "igeihdejaeci", "ibfdjhgeje", "biajghjhbgeji", "ddhihhdhbjahj", "hiaghcdacaffac", "fedhjebja", "ijeiafdhebcjiaghge", "gjghhejd", "cdifeiieibgh", "ageejdhahbfec", "dd", "dbgacdcbei", "febddeeeacajdhjaei", "abgbd", "ifcfafj", "hhbbgc", "bhhcegddcbhfefhjdcbj", "ge", "diiiabijhajbbgec", "ffffgfedgaigajgjhjh", "debgdijadafi", "aajcgachfhde", "dbfjgaefdagjfiiff", "bggdigceacjjghic", "ebeigbfbcjdfigac", "ibghaffbbd", "hdbccgecjiifgc", "dhadh", "hjfeccighahbgeai", "jcghj", "efigjc", "fegidajaejcg", "aedef", "cbebcaaiieej", "hejdah", "efechjjegbagbb", "bdghfieccdfjajja", "acidjhjiffhgf", "gehciacgaeijcffbc", "jebagdbic", "dgjjcaicehejicedjc", "bd", "aabfddhbgghaia", "ibhgffjbjdajgd", "ececf", "abcdfjifeja", "bcfciijhdddjhghhdf", "ddbcceieddhefdgecb", "ga", "behffcgaggi", "edhc", "jc", "jjhjgegcgcj", "eccidejjgcfbdhbdiacj", "ijdifefehgae", "gdihed", "ahhbaeef", "ccccfcageb", "haeaaajdccjdbc", "ccgfjhaa", "hajfbgdgeiagcefddj", "cgidcefjdcbcb", "bjcbid", "iciibiaibjc", "ehggfdbi", "aaggcacbacb", "gbchaj", "eah", "hede", "agcaaaeadjghgebh", "hagdgaffhj", "ahdbi", "ijbecgg", "bcgdcagc", "edejgfhb", "aade", "hcfajbagf", "hfddai", "bjbfbcdhjhijdjjfdh", "hihdbcih", "dffjecfahbahbj", "gfcchdbgfgaiddbgheb", "daafjcehejacghegeeh", "ehdgi"})).containsExactlyInAnyOrder(
                List.of(2, 221),
                List.of(2, 287),
                List.of(2, 289),
                List.of(2, 514),
                List.of(20, 27),
                List.of(20, 412),
                List.of(22, 240),
                List.of(27, 182),
                List.of(32, 166),
                List.of(32, 198),
                List.of(32, 235),
                List.of(32, 309),
                List.of(32, 437),
                List.of(32, 450),
                List.of(33, 83),
                List.of(33, 388),
                List.of(39, 240),
                List.of(39, 403),
                List.of(39, 510),
                List.of(41, 39),
                List.of(41, 183),
                List.of(41, 517),
                List.of(44, 33),
                List.of(44, 388),
                List.of(66, 437),
                List.of(83, 368),
                List.of(83, 483),
                List.of(86, 368),
                List.of(102, 41),
                List.of(107, 32),
                List.of(109, 304),
                List.of(143, 32),
                List.of(143, 198),
                List.of(151, 164),
                List.of(182, 44),
                List.of(182, 86),
                List.of(182, 416),
                List.of(183, 304),
                List.of(198, 143),
                List.of(198, 240),
                List.of(204, 20),
                List.of(207, 41),
                List.of(221, 449),
                List.of(240, 143),
                List.of(240, 447),
                List.of(249, 33),
                List.of(287, 304),
                List.of(289, 20),
                List.of(289, 533),
                List.of(292, 32),
                List.of(294, 304),
                List.of(296, 20),
                List.of(304, 226),
                List.of(304, 390),
                List.of(304, 476),
                List.of(304, 507),
                List.of(309, 304),
                List.of(309, 507),
                List.of(368, 204),
                List.of(368, 207),
                List.of(368, 294),
                List.of(368, 483),
                List.of(377, 143),
                List.of(388, 44),
                List.of(388, 182),
                List.of(405, 127),
                List.of(405, 304),
                List.of(412, 33),
                List.of(416, 2),
                List.of(437, 33),
                List.of(437, 377),
                List.of(439, 483),
                List.of(447, 182),
                List.of(449, 102),
                List.of(449, 249),
                List.of(450, 41),
                List.of(465, 289),
                List.of(476, 304),
                List.of(483, 33),
                List.of(483, 83),
                List.of(507, 32),
                List.of(507, 309),
                List.of(514, 33),
                List.of(517, 29),
                List.of(517, 182),
                List.of(534, 20)
        );
    }
}
