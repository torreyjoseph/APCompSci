import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        String rawResults = "236392,1,4,4,4;418945,3,4,4,4;408892,2,4,2,4;248043,1,1,3,2;138645,4,3,4,3;156160,4,4,2,3;" +
                "121122,3,4,3,1;102572,2,4,1,4;278579,1,3,3,1;311936,2,2,1,2;180091,4,2,4,3;131991,3,4,1,3;349678,3,2,2," +
                "1;348822,4,2,1,1;358463,4,2,2,2;142865,1,1,1,2;397632,2,2,4,2;233101,2,3,2,1;336269,3,2,1,1;139745,3,1," +
                "1,1;388694,1,4,4,2;435193,1,1,2,1;298522,4,2,2,4;463523,3,2,1,3;340719,1,1,4,3;248911,4,2,4,2;176898,3," +
                "3,4,1;176697,2,1,3,4;479451,2,4,1,3;193036,1,3,2,1;130872,4,4,2,1;440023,4,4,3,4;376006,2,2,4,3;370599," +
                "1,3,3,4;114011,4,1,3,4;333671,2,1,3,3;116340,4,4,3,3;127895,3,1,1,4;475663,3,3,3,4;308242,1,2,4,4;176660" +
                ",2,1,1,4;346022,3,2,4,2;313979,4,3,2,1;135913,1,2,4,2;180578,3,2,2,3;485579,4,4,2,3;313900,2,4,2,4;188421" +
                ",4,2,4,3;475741,3,1,2,3;307455,3,4,3,2;356172,1,2,1,3;176303,1,2,3,3;141175,1,3,4,1;458524,1,3,1,1;359897" +
                ",3,2,4,4;164080,2,2,2,4;310114,3,4,4,4;372346,3,1,2,2;341926,2,3,3,4;455848,2,1,4,2;298914,1,1,1,3;434548" +
                ",3,3,3,3;454765,1,4,1,2;111469,3,3,4,2;215916,4,2,1,2;156160,4,3,1,4;409619,4,1,3,1;189440,2,1,4,2;354588" +
                ",2,4,2,4;240064,2,2,1,1;317390,2,1,2,2;452034,1,1,1,3;305126,4,1,4,3;274294,3,4,4,4;473603,4,1,3,1;369608" +
                ",4,2,4,3;456720,2,3,4,1;430577,1,3,4,4;420094,4,4,1,3;238780,4,1,2,4;284283,4,3,1,2;494623,1,3,2,2;345578" +
                ",3,3,4,1;136356,3,3,1,2;391631,1,2,2,1;474920,4,1,2,2;484250,3,1,1,3;238515,2,4,1,3;332342,1,3,2,3;160398" +
                ",4,4,3,2;251800,2,3,1,3;458410,1,1,3,3;287110,4,1,4,3;276739,2,4,3,3;207147,1,2,3,4;146882,1,1,3,2;137548" +
                ",1,3,1,2;205973,4,1,1,2;205347,2,2,1,3;407213,4,1,1,3;111757,4,2,4,4;214753,2,1,1,1;423330,3,4,3,3;346175" +
                ",4,1,4,4;305046,2,2,4,1;213102,1,3,1,1;443390,2,3,3,3;244222,3,3,3,1;245179,1,1,3,4;117506,2,3,2,4;190445" +
                ",2,1,2,4;176303,3,1,2,1;240771,3,3,1,4;363851,3,4,4,2;206981,1,1,4,1;299605,2,1,3,3;457468,1,2,4,3;352242" +
                ",1,4,2,1;444307,2,1,3,3;160376,2,2,4,2;485431,4,2,1,2;453972,3,3,4,3;202989,2,1,1,3;438282,3,4,2,4;490054" +
                ",1,1,2,2;397395,1,1,2,3;240328,4,2,2,2;499270,1,3,4,1;465025,4,2,2,3;417590,1,2,4,4;188976,2,3,1,3;272392" +
                ",4,4,2,2;423927,4,4,1,4;278516,3,3,1,1;120319,4,2,4,1;445179,2,1,3,3;138408,3,2,1,3;106318,4,1,4,3;138444" +
                ",1,1,3,1;145097,3,1,1,2;495854,4,4,1,4;274012,1,4,3,3;167018,4,3,2,1;218219,3,2,3,4;329419,1,2,3,2;108514" +
                ",1,1,4,1;186107,4,4,2,4;369057,1,1,3,1;461062,1,4,3,3;104673,1,1,3,2;463064,3,1,2,2;228802,2,1,2,2;383179" +
                ",4,4,4,1;498575,4,2,3,2;445273,3,3,2,3;144250,2,2,3,4;298522,3,2,4,2;119306,2,1,4,4;402763,2,4,2,4;156269" +
                ",4,4,3,2;117512,3,4,1,1;217492,4,1,1,1;228596,1,3,4,4;303953,1,4,2,2;160440,1,3,1,2;444045,3,2,2,4;362734" +
                ",4,1,2,2;457199,3,2,1,1;390175,1,3,3,3;355108,3,3,4,1;260366,3,3,1,1;217192,2,3,1,3;357978,1,2,1,4;166541" +
                ",3,3,1,4;109639,2,2,2,4;125169,3,2,3,1;237380,4,3,3,4;317118,3,1,2,3;280006,2,1,2,4;410177,2,3,3,4;398208" +
                ",1,4,4,3;211730,4,3,2,4;105442,4,1,2,4;266893,2,3,2,4;316151,2,2,1,4;429162,3,4,2,4;414973,3,4,2,3;373728" +
                ",1,2,2,1;401535,1,2,1,3;354030,2,2,1,4;461310,1,2,2,3;496987,1,3,1,1;481665,3,2,2,1;355186,4,3,4,4;337331" +
                ",4,1,3,3;123777,2,3,3,1;492661,4,1,2,1;258113,2,2,4,1;319492,1,4,1,1;399666,3,1,4,4;476970,1,1,2,4;490605" +
                ",4,4,4,2;475034,3,2,1,2;321855,3,2,4,3;498697,4,4,4,1;436437,1,2,3,3;104887,1,1,3,4;407201,2,4,1,2;136806" +
                ",1,1,1,3;449179,1,2,1,3;447780,2,2,4,1;112827,4,4,1,1;323141,1,1,2,2;234307,1,4,2,3;246026,1,3,1,3;219714" +
                ",2,4,2,1;368650,3,4,4,1;309322,1,1,2,2;495204,1,3,1,3;141214,4,1,4,3;101951,3,1,1,3;137169,1,4,2,1;250262" +
                ",2,2,2,4;294619,2,2,4,4;250540,1,3,3,1;360720,4,3,2,3;187681,1,3,2,2;143402,3,3,1,2;252362,2,3,1,1;454494" +
                ",2,2,1,3;427706,1,3,1,4;359923,4,1,3,4;388976,2,1,4,1;140156,2,4,4,4;459931,2,1,3,4;477808,2,2,2,4;248205" +
                ",3,3,3,4;355132,1,4,3,1;103042,1,2,3,1;481606,1,2,4,2;345578,1,1,2,3;238947,4,4,1,2;473687,2,4,2,3;159439" +
                ",3,3,3,1;429067,4,3,3,4;444958,3,4,4,4;474788,2,2,1,3;159366,2,2,2,1;397544,4,4,4,1;407677,1,2,2,3";
        String[] Results = rawResults.split(";");
        int[][] PreBallot = new int[5][Results.length];
        for (int i = 0; i < Results.length; i++) {
            String[] Ballot = Results[i].split(",");
            for (int j = 0; j < 5; j++) {
                PreBallot[j][i] = Integer.parseInt(Ballot[j]);
            }
        }
        for (int i = 0; i < Results.length; i++) {
            for (int j = 0; j < Results.length; j++) {
                if (PreBallot[0][i] == PreBallot[0][j] && i != j) {
                    PreBallot[1][i] = 0;
                    PreBallot[2][i] = 0;
                    PreBallot[3][i] = 0;
                    PreBallot[4][i] = 0;
                }
            }
        }
        System.out.println("╔═╦════════════════════════╦═╗\n"+ "║✭║    ELECTION RESULTS    ║✭║");
        int GoldingCount = 0;
        int GotshalkCount = 0;
        int EvansCount = 0;
        int VillalobosCount = 0;
        int SarkarCount = 0;
        int AhnCount = 0;
        int CampCount = 0;
        int LeBlancCount = 0;
        int HowardCount = 0;
        int RubinoCount = 0;
        int FisherCount = 0;
        int EddeCount = 0;
        int GassnerCount = 0;
        int BennetCount = 0;
        int RitscherCount = 0;
        int HurleyCount = 0;
        for (int x = 0; x < Results.length; x++) {
            if (PreBallot[1][x] == 1)
                GoldingCount++;
            else if (PreBallot[1][x] == 2)
                GotshalkCount++;
            else if (PreBallot[1][x] == 3)
                EvansCount++;
            else if (PreBallot[1][x] == 4)
                VillalobosCount++;
        }
        int President = GoldingCount;
        if (GotshalkCount > President) {
            President = GotshalkCount;
            System.out.println("║✭║ President: Gotshalk    ║✭║");
        }
        if (EvansCount > President) {
            President = EvansCount;
            System.out.println("║✭║ President: Evans       ║✭║");
        }
        if (VillalobosCount > President) {
            System.out.println("║✭║ President: Villalobos  ║✭║");
        }
        else {
            System.out.println("║✭║ President: Golding     ║✭║");
        }
        for (int x = 1; x < Results.length; x++) {
            if (PreBallot[2][x] == 1)
                SarkarCount++;
            else if (PreBallot[2][x] == 2)
                AhnCount++;
            else if (PreBallot[2][x] == 3)
                CampCount++;
            else if (PreBallot[2][x] == 4)
                LeBlancCount++;
        }
        int VP = SarkarCount;
        if (AhnCount > VP) {
            VP = AhnCount;
            System.out.println("║✭║ Vice-President: Ahn    ║✭║");
        }
        if (CampCount > VP) {
            VP = CampCount;
            System.out.println("║✭║ Vice-President: Camp   ║✭║");
        }
        if (LeBlancCount > VP) {
            System.out.println("║✭║ Vice-President: LeBlanc║✭║");
        }
        else {
            System.out.println("║✭║ Vice-President: Sarkar ║✭║");
        }
        for (int x = 2; x < Results.length; x++) {
            if (PreBallot[3][x] == 1)
                HowardCount++;
            else if (PreBallot[3][x] == 2)
                RubinoCount++;
            else if (PreBallot[3][x] == 3)
                FisherCount++;
            else if (PreBallot[3][x] == 4)
                EddeCount++;
        }
        int Secretary = HowardCount;
        if (RubinoCount > Secretary) {
            Secretary = RubinoCount;
            System.out.println("║✭║ Secretary: Rubino      ║✭║");
        }
        if (FisherCount > Secretary) {
            Secretary = FisherCount;
            System.out.println("║✭║ Secretary: Fisher      ║✭║");
        }
        if (EddeCount > Secretary) {
            System.out.println("║✭║ Secretary: Edde        ║✭║");
        }
        else {
            System.out.println("║✭║ Secretary: Howard      ║✭║");
        }
        for (int x = 3; x < Results.length; x++) {
            if (PreBallot[4][x] == 1)
                GassnerCount++;
            else if (PreBallot[4][x] == 2)
                BennetCount++;
            else if (PreBallot[4][x] == 3)
                RitscherCount++;
            else if (PreBallot[4][x] == 4)
                HurleyCount++;
        }
        int Treasurer = GassnerCount;
        if (BennetCount > Treasurer) {
            Treasurer = BennetCount;
            System.out.println("║✭║ Treasurer: Bennet      ║✭║");
        }
        if (RitscherCount > Treasurer) {
            Treasurer = RitscherCount;
            System.out.println("║✭║ Treasurer: Ritscher    ║✭║");
        }
        if (HurleyCount > Treasurer) {
            System.out.println("║✭║ Treasurer: Hurley      ║✭║");
        }
        //else {
        //    System.out.println("║✭║ Treasurer: Gassner     ║✭║");
        //}
        System.out.println("╚═╩════════════════════════╩═╝");

    }
}