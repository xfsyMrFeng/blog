package com.xfsy.web.blog.test;

import com.xfsy.web.blog.entity.Essay;
import com.xfsy.web.blog.entity.Tag;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;

/**
 * Class : TestEssay
 * Desc  : ...
 * Use   : ...
 * Author: xfsyMrFeng
 * Tool  : IntelliJ IDEA
 * Date  : 2017/5/21 0021
 * Time  : 01:36
 */
public class TestEssay {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init() {
        Configuration config = new Configuration().configure();
        sessionFactory = config.buildSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    @After
    public void destory() {
        //提交事务
        transaction.commit();
        //关闭session
        session.close();
        //关闭sessionFactory
        sessionFactory.close();
    }

    @Test
    public void testSaveEssay() {
        String content = "新华社贵阳5月14日电（记者刘茁卉、杨洪涛）“在2016年扶贫开发工作成效考核中，我县考核结果全省挂末。对此，县委、县政府集体深刻检讨，作为县委书记和全县脱贫攻坚第一责任人，我负主要责任。”13日，在贵州省第三次大扶贫战略行动推进大会上，天柱县县委书记陆再义公开检讨。\n" +
                "\n" +
                "　　记者采访了解到，按照贵州省委、省政府关于脱贫攻坚决策部署，省扶贫开发领导小组对全省9个市（州）、贵安新区、66个贫困县、19个有扶贫开发任务县的党委和政府2016年扶贫开发工作成效进行考核。\n" +
                "\n" +
                "　　其中，关岭县、思南县、独山县、普定县、天柱县为“综合评价较差的县”。这5个县的县委书记进行公开检讨，全面查摆问题，并对如何全力抓好整改、迎头赶上表态。\n" +
                "\n" +
                "　　“省、州对我县的通报与问责，我将带头认领并着力整改。”陆再义说，从2015年全省排名第五、全州排名第二的位次到2016年全省挂末，落差巨大，主要是思想认识不深刻、工作作风不扎实、干部管理不严格、统筹指挥协调不到位等原因造成。“我代表天柱县委、县政府郑重承诺，决心举全县之力，坚决打好脱贫攻坚翻身仗。”\n" +
                "\n" +
                "　　据介绍，根据此次考核结果，贵州对考核前三的市和综合评价好的重点县给予表扬，并在2017年中央财政专项扶贫资金分配上给予奖励；对考核结果挂末的市、综合评价较差的县党政主要负责同志分别进行约谈。考核结果将送贵州省委组织部，作为对市县两级党委、政府主要负责同志和领导班子综合评价的重要依据。\n" +
                "\n" +
                "　　相关报道\n" +
                "\n" +
                "　　贵州省第三次大扶贫战略行动推进大会在贵阳召开 陈敏尔书记、孙志刚省长讲话\n" +
                "\n" +
                "　　贵州省第三次大扶贫战略行动推进大会强调\n" +
                "\n" +
                "　　来一场脱贫攻坚大比武\n" +
                "\n" +
                "　　确保脱贫攻坚再战告捷\n" +
                "\n" +
                "　　陈敏尔　孙志刚讲话　王富玉出席\n" +
                "\n" +
                "　　5月13日，全省第三次大扶贫战略行动推进大会在贵阳召开，省委书记、省人大常委会主任陈敏尔，省委副书记、省长孙志刚出席会议并讲话。会议强调，全省上下要深入学习贯彻习近平总书记关于脱贫攻坚重要讲话精神和指示要求，更加精准扎实推进大扶贫战略行动，来一场脱贫攻坚“大比武”，比责任担当，比路径方法，比干部作风，比精神状态，比群众获得感，确保今年脱贫攻坚再战告捷，以优异成绩迎接党的十九大胜利召开。\n" +
                "\n" +
                "　　省政协主席王富玉出席会议，省委常委、常务副省长秦如培主持会议，省委常委，省人大常委会副主任，省政府副省长，省政协副主席，省级脱贫攻坚督导组组长参加会议。\n" +
                "\n" +
                "　　陈敏尔在讲话中指出，去年以来，全省上下深学笃用习近平总书记系列重要讲话精神和扶贫开发重要战略思想，全力实施大扶贫战略行动，工作部署真抓实干，政策措施与时俱进，责任落实较真碰硬，脱贫成绩扎实有效，各项工作取得了新的进步。这次项目观摩是省第十二次党代会后的首次项目观摩，主题鲜明、内容丰富、行程紧凑，是对党代会精神的大宣讲，是对各地贯彻落实党代会精神情况的大检阅，也是对脱贫攻坚“春季攻势”成效的大验收。通过这次观摩，大家感到两条底线越守越牢，三大战略行动深入人心，百姓富生态美的精彩画卷徐徐展开，既看出了决心信心，也看到了问题差距，更看清了方向路径。\n" +
                "\n" +
                "　　陈敏尔强调，今年是我省精准扶贫、精准脱贫的深化之年。脱贫攻坚既是“大战场”，也是“大考场”。当前，“春季攻势”已经结束，但脱贫攻坚还在路上。我们要在全省各市州、各县区、各乡镇、各村寨特别是各级领导干部中来一场脱贫攻坚“大比武”，比一比精准扶贫的“绣花”功夫，比一比脱贫攻坚的“十八般武艺”，在比中学习、在比中提升、在比中赶超，按下“快进键”、跑出“加速度”、干出新业绩。一要比责任担当。向总书记看齐、向总书记学习，进一步提高政治站位、强化责任担当、坚守民生情怀，凝心聚力抓，亲力亲为抓，共同履责抓，统筹兼顾抓，做到时时、事事、人人、处处负责担当，确保高质量完成脱贫攻坚工作任务。二要比路径方法。既讲认识论也讲方法论，更加注重改革牵引，更加注重项目建设，更加注重问题导向，更加注重典型引路，更加注重发动群众，更加注重考核评估，着力解决贫中之贫、坚中之坚、困中之困、难中之难、急中之急问题，不断提高脱贫攻坚的能力和水平。三要比干部作风。自觉践行“三严三实”要求，抓遍访回访，抓干部管理，抓基层组织，抓政策落地，抓督察督导，抓民生监督，比谁更精准、比谁更高效、比谁更扎实、比谁更廉洁，尽超常之责、用超常之策、举超常之力、创超常之绩，真正以作风换实绩。四要比精神状态。结合深入推进“两学一做”学习教育常态化制度化，大力学习弘扬艰苦创业、改革创新精神，坚定不忘初心、为民服务的信念，淬炼直面困难、永不退缩的气概，增强久久为功、绵绵用力的定力，保持勇于改革、善作善成的劲头，构筑好脱贫攻坚的“精神高地”。五要比群众获得感。围绕实现百姓富、生态美有机统一，紧扣“一达标、两不愁、三保障”目标要求，与时俱进增进群众获得感，确保现行标准下农村贫困人口全部脱贫。\n" +
                "\n" +
                "\n" +
                "　　孙志刚指出，今年省委、省政府组织发动脱贫攻坚“春季攻势”，各地各部门狠抓落实、捷报频传，产业扶贫有新进展、易地搬迁扶贫稳步推进、教育医疗扶贫力度加大、干部作风更加深入扎实，取得重大成效。他强调，要坚决贯彻以习近平同志为核心的党中央关于脱贫攻坚决策部署，全面落实省第十二次党代会精神，坚持精准扶贫精准脱贫基本方略，以较真促认真，以碰硬求过硬，以具体保精准，下一番“绣花”功夫，巩固“春季攻势”战果，推广“春季攻势”经验，加快解决存在的问题和不足，确保打好今年脱贫攻坚战。要更加深入细致做好精准识别精准退出，围绕漏评率、错退率、群众满意度三项核心指标，深入开展精准识别回头看和贫困退出大筛查，防止数字脱贫、虚假脱贫。要更加精准有力打好产业扶贫硬仗，把产业扶贫同推进农业供给侧结构性改革、深化农村改革紧密结合起来，选准主攻产业和主攻方向，坚持强龙头、创品牌、带农户，创新产销对接机制，强化配套服务，促进贫困群众稳定脱贫。要更加精准有力打好易地搬迁扶贫硬仗，加快完成2016年搬迁项目扫尾工作，高标准严要求建好安置房，扎实做好搬迁群众后续保障，确保搬得出、稳得住、能致富。要更加精准管好用好扶贫资金，统筹整合用好财政涉农资金，加快用好扶贫产业子基金，从严加强资金监管，切实提高使用效益。要更加注重贫困群众教育医疗住房等保障，对贫困家庭学生应助尽助，扎实抓好健康扶贫，加快推进农村危房改造。要更加深入落实基层帮扶责任，驻村干部必须驻村，压实结对帮扶责任，及时兑现帮扶措施，切实解决好群众的实际困难。要更加强化督导监督倒逼责任落实，加强督查暗访、专项审计和民生监督，确保各项政策措施落到实处、见到实效。\n" +
                "\n" +
                "　　会议宣读了省委关于授予黄大发同志“全省脱贫攻坚优秀共产党员”称号、授予塘约村党总支“全省脱贫攻坚改革先进基层党组织”称号的决定，陈敏尔、孙志刚分别颁发证书、授予牌匾。会上，观看了黄大发同志和塘约村党总支先进事迹宣传宣讲，天柱县、普定县、独山县、思南县、关岭自治县党委主要负责同志作了表态发言。\n" +
                "\n" +
                "　　各市（州）党委、政府，贵安新区党工委、管委会，省有关部门和单位，部分金融机构、在筑国有企业、省级投资公司，“1+8”重点开放平台党工委、管委会主要负责同志，各县（市、区、特区）党政主要负责同志在主会场参会。会议以电视电话形式开到县，省设主会场，市（州）、贵安新区，县（市、区、特区）设分会场。（记者 许邵庭）";
        Essay essay = new Essay("当着省委书记面 5名县委书记扶贫不力登台检讨", content, "在2016年扶贫开发工作成效考核中，我县考核结果全省挂末。对此，县委、县政府集体深刻检讨，作为县委书记和全县脱贫攻坚第一责任人，我负主要责任。", "http://n.sinaimg.cn/news/transform/20170515/lwbP-fyfeutp9523437.jpg", System.currentTimeMillis());

        Tag tag1 = new Tag("新闻");
        Tag tag2 = new Tag("新华社");

        Set<Tag> set = new HashSet<Tag>();
        set.add(tag1);
        set.add(tag2);

        essay.setTags(set);

        session.save(essay);
        session.save(tag1);
        session.save(tag2);
    }

}
