/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SetterGetter;

/**
 *
 * @author LENOVO
 */
public class TugasSetterGetter {
    private String nomor_rekening;
    private String pin;
    
    public void SetNomor_rekening (String nomor_rekening){
        this.nomor_rekening = nomor_rekening;
    }
    
    public void SetPin (String pin){
        this.pin = pin;
    }
    public String GetNomor_rekening(){
        return this.nomor_rekening;
    }
    public String GetPin (){
        return this.pin;
    }
}
