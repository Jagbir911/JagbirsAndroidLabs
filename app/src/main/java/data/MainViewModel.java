package data;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public String editString;
    public String theText;
    public String buttonText;
    public MutableLiveData<Boolean> isSelected=new MutableLiveData<>();

}
