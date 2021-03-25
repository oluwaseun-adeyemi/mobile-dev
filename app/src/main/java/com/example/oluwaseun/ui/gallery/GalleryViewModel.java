package com.example.oluwaseun.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(" STATE\tJAN\t FEB\tMAR\tAPR\tMAY\tJUN\tJUL\t AUG\tSEP\tOCT\t NOV\t17TH DEC\n" +
                "Abia\t0\t0\t0\t2\t14\t320\t549\t775\t895\t898\t926\t973\n" +
                "Adamawa\t0\t0\t0\t3\t41\t84\t164\t228\t237\t257\t261\t329\n" +
                "Akwa-Ibom\t0\t0\t4\t16\t45\t86\t221\t278\t293\t295\t339\t366\n" +
                "Anambra\t0\t0\t0\t1\t11\t73\t135\t216\t248\t277\t285\t295\n" +
                "Bauchi\t0\t0\t3\t45\t240\t505\t560\t668\t699\t713\t773\t878\n" +
                "Bayelsa\t0\t0\t0\t5\t21\t233\t336\t391\t399\t413\t454\t492\n" +
                "Benue\t0\t0\t1\t1\t9\t65\t346\t459\t481\t493\t496\t515\n" +
                "Borno\t0\t0\t0\t68\t284\t493\t613\t741\t745\t745\t745\t772\n" +
                "Cross River\t0\t0\t0\t0\t0\t0\t45\t82\t87\t87\t90\t92\n" +
                "Delta\t0\t0\t0\t15\t87\t1126\t1510\t1748\t1802\t1814\t1824\t1,829\n" +
                "Ebonyi\t0\t0\t0\t2\t40\t438\t793\t999\t1042\t1049\t1055\t1,082\n" +
                "Edo\t0\t0\t4\t46\t316\t1163\t2298\t2586\t2628\t2666\t2699\t2,755\n" +
                "Ekiti\t0\t0\t2\t10\t20\t43\t139\t272\t321\t335\t365\t401\n" +
                "Enugu\t0\t0\t2\t4\t18\t325\t817\t1162\t1289\t1314\t1332\t1,363\n" +
                "F C T\t0\t0\t34\t204\t671\t1933\t3899\t5195\t5720\t6111\t6865\t9,053\n" +
                "Gombe\t0\t0\t0\t88\t161\t507\t607\t723\t883\t937\t938\t1,156\n" +
                "Imo\t0\t0\t0\t2\t38\t351\t469\t529\t572\t617\t676\t730\n" +
                "Jigawa\t0\t0\t0\t7\t270\t318\t322\t322\t325\t325\t331\t385\n" +
                "Kaduna\t0\t0\t4\t35\t281\t804\t1457\t2150\t2453\t2654\t3134\t4,236\n" +
                "Kano\t0\t0\t0\t285\t957\t1256\t1597\t1727\t1738\t1747\t1797\t1,988\n" +
                "Katsina\t0\t0\t0\t40\t369\t577\t744\t796\t864\t952\t1030\t1,359\n" +
                "Kebbi\t0\t0\t0\t2\t33\t81\t90\t93\t93\t93\t93\t143\n" +
                "Kogi\t0\t0\t0\t0\t2\t4\t5\t5\t5\t5\t5\t5\n" +
                "Kwara\t0\t0\t0\t13\t106\t234\t753\t966\t1036\t1069\t1106\t1,275\n" +
                "Lagos\t0\t0\t89\t998\t4982\t10,627\t15,169\t18,153\t19,541\t21,275\t23,404\t25,895\n" +
                "Nassarawa\t0\t0\t0\t6\t76\t213\t326\t434\t452\t482\t493\t589\n" +
                "Niger\t0\t0\t0\t3\t33\t116\t223\t243\t259\t274\t298\t338\n" +
                "Ogun\t0\t1\t4\t56\t280\t868\t1396\t1657\t1858\t2046\t2228\t2,360\n" +
                "Ondo\t0\t0\t0\t12\t27\t324\t1182\t1542\t1631\t1667\t1728\t1,769\n" +
                "Osun\t0\t0\t12\t34\t45\t127\t546\t784\t842\t929\t947\t971\n" +
                "Oyo\t0\t0\t8\t27\t300\t1391\t2766\t3118\t3267\t3450\t3728\t3,785\n" +
                "Plateau\t0\t0\t0\t1\t105\t382\t1205\t2626\t3451\t3648\t3877\t4,179\n" +
                "Rivers\t0\t0\t1\t14\t232\t1087\t1802\t2141\t2426\t2828\t2995\t3,234\n" +
                "Sokoto\t0\t0\t0\t40\t116\t151\t154\t159\t162\t165\t166\t210\n" +
                "Taraba\t0\t0\t0\t8\t18\t19\t54\t87\t102\t146\t163\t203\n" +
                "Yobe\t0\t0\t0\t3\t52\t61\t67\t67\t76\t82\t100\t123\n" +
                "Zamfara\t0\t0\t0\t8\t76\t76\t77\t78\t78\t79\t79\t79\n");
    }

    public LiveData<String> getText() {
        return mText;
    }
}