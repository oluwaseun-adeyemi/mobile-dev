package com.example.oluwaseun.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("states\tmale\tfemale\ttotal\n" +
                "ABIA\t1573578.103\t1511869.158\t3085447.262\n" +
                "ADAMAWA\t1768632.06\t1699273.94\t3467906\n" +
                "AKWA/IBOM\t2203744.059\t2117322.724\t4321066.783\n" +
                "ANAMBRA\t2317402.488\t2226523.959\t4543926.446\n" +
                "BAUCHI\t2627891.474\t2524836.907\t5152728.381\n" +
                "BAYELSA\t948319.3746\t911130.3795\t1859449.754\n" +
                "BENUE\t2373654.543\t2280570.051\t4654224.594\n" +
                "BORNO\t2355695.931\t2263315.698\t4619011.628\n" +
                "CROSS RIVER\t1609535.012\t1546415.992\t3155951.004\n" +
                "DELTA\t2308673.666\t2218137.443\t4526811.109\n" +
                "EBONYI\t1207532.333\t1160178.124\t2367710.457\n" +
                "EDO\t1788145.674\t1718022.314\t3506167.988\n" +
                "EKITI\t1342709.391\t1290054.121\t2632763.512\n" +
                "ENUGU\t1823547.436\t1752035.772\t3575583.209\n" +
                "GOMBE\t1327703.001\t1275636.216\t2603339.217\n" +
                "IMO\t2204883.292\t2118417.28\t4323300.572\n" +
                "JIGAWA\t2426275.327\t2331127.275\t4757402.602\n" +
                "KADUNA\t3411511.261\t3277726.505\t6689237.766\n" +
                "KANO\t5293619.079\t5086026.174\t10379645.25\n" +
                "KATSINA\t3237451.449\t3110492.569\t6347944.018\n" +
                "KEBBI\t1822703.86\t1751225.277\t3573929.137\n" +
                "KOGI\t1849331.719\t1776808.907\t3626140.626\n" +
                "KWARA\t1319935.296\t1268173.128\t2588108.424\n" +
                "LAGOS\t5116260.488\t4915622.822\t10031883.31\n" +
                "NASARAWA\t1043166.362\t1002257.878\t2045424.24\n" +
                "NIGER\t2233519.065\t2145930.082\t4379449.147\n" +
                "OGUN\t2112168.702\t2029338.557\t4141507.259\n" +
                "ONDO\t1931269.332\t1855533.28\t3786802.612\n" +
                "OSUN\t1918236.781\t1843011.809\t3761248.591\n" +
                "OYO\t3151896.784\t3028292.989\t6180189.773\n" +
                "PLATEAU\t1773305.137\t1703763.759\t3477068.895\n" +
                "RIVERS\t2936055.808\t2820916.365\t5756972.173\n" +
                "SOKOTO\t2066200.159\t1985172.701\t4051372.86\n" +
                "TARABA\t1276728.747\t1226660.953\t2503389.701\n" +
                "YOBE\t1314951.287\t1263384.57\t2578335.858\n" +
                "ZAMFARA\t1840717.079\t1768532.095\t3609249.174\n" +
                "FCT ABUJA\t947976.2891\t910800.7483\t1858777.037\n");
    }

    public LiveData<String> getText() {
        return mText;
    }
}