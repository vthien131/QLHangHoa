/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyhanghoa;

/**
 *
 * @author Tung
 */
public class DisplayComboBoxModel {
    public Object DisplayMember;
    public Object DisplayValue;
    public DisplayComboBoxModel(String member, String value){
        DisplayMember = member;
        DisplayValue = value;
    }
    @Override
    public String toString(){
        return DisplayMember.toString();
    }
}
