package com.example.ks.moodle;

import android.view.View;

public class ViewPath {
    View view;              //view
    String viewTree;          //view在视图树上的路径
    String specifyTag;
    int level = 0;//层级默认为0
    int filterLevelCount = 3;//需要过滤的层级

    ViewPath(View view, String viewTree) {
        this.view = view;
        this.viewTree = viewTree;
    }
}
