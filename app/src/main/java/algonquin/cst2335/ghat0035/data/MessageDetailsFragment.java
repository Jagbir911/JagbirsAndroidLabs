package algonquin.cst2335.ghat0035.data;



import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import algonquin.cst2335.ghat0035.databinding.DetailsLayoutBinding;


public class MessageDetailsFragment extends Fragment {



    ChatMessage selected;
    public MessageDetailsFragment() {
    }
    public MessageDetailsFragment(ChatMessage m) {
        selected = m;
    }
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        DetailsLayoutBinding binding = DetailsLayoutBinding.inflate(inflater);
        binding.messageTextt.setText(selected.message);
        binding.timeTextt.setText(selected.timeSent);
        binding.databaseText.setText("Id = "+selected.id);
        return binding.getRoot();
    }
    public void displayMessage(ChatMessage newValue){
    }
}
