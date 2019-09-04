package com.example.ks.moodle.util;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TreeViewAdapter extends BaseExpandableListAdapter {
    public  static final int ItemHeight=105;
    public static final int PaddingLeft=36;

    private  int myPaddingLeft=0;

    static public class TreeNode{
        public Object parent;
        public List<Object> childs=new ArrayList<Object>();
    }

    List<TreeNode> treeNodes=new ArrayList<TreeNode>();
    Context parentContext;

    public TreeViewAdapter(Context context, int myPaddingLeft){
        parentContext=context;
        this.myPaddingLeft=myPaddingLeft;

    }

    public List<TreeNode> getTreeNodes(){
        return treeNodes;
    }
    public void UpdateTreeNode(List<TreeNode> nodes){
        treeNodes=nodes;
    }
    public void RemoveAll(){
        treeNodes.clear();
    }

    static public TextView getTextView(Context context){
        AbsListView.LayoutParams lp=new AbsListView.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,ItemHeight);
        TextView textView=new TextView(context);
        textView.setLayoutParams(lp);
        textView.setGravity(Gravity.CENTER_VERTICAL|Gravity.LEFT);
        return textView;
    }
    @Override
    public int getGroupCount() {
        return treeNodes.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return treeNodes.get(groupPosition).childs.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return treeNodes.get(groupPosition).parent;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return treeNodes.get(groupPosition).childs.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        TextView textView=getTextView(this.parentContext);
        textView.setText(getGroup(groupPosition).toString());

        return textView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        TextView textView=getTextView(this.parentContext);
        textView.setText(getChild(groupPosition,childPosition).toString());
        textView.setPadding(myPaddingLeft+PaddingLeft,0,0,0);
        return textView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
