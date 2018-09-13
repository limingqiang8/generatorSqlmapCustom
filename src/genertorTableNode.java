public class genertorTableNode {

    /**
     * show tables --> tbs
     * 生成表数据表标签 <table tableName="user"></table>
     * @param args
     */
    public static void main(String[] args) {

        String tbs = "tb_address\n" +
                "tb_areas\n" +
                "tb_brand\n" +
                "tb_cities\n" +
                "tb_content\n" +
                "tb_content_category\n" +
                "tb_freight_template\n" +
                "tb_goods\n" +
                "tb_goods_desc\n" +
                "tb_item\n" +
                "tb_item_cat\n" +
                "tb_order\n" +
                "tb_order_item\n" +
                "tb_pay_log\n" +
                "tb_provinces\n" +
                "tb_seckill_goods\n" +
                "tb_seckill_order\n" +
                "tb_seller\n" +
                "tb_specification\n" +
                "tb_specification_option\n" +
                "tb_type_template\n" +
                "tb_user";

        getNodes(tbs);
    }

    private static void getNodes(String tbs) {
        String[] tb = tbs.split("\n");
        for (String t : tb) {
            System.out.println("<table tableName=\""+t+"\"></table>");
        }
    }
}
