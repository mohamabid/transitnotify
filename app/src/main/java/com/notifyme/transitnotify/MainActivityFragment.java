package com.notifyme.transitnotify;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.notifyme.transitnotify.datamodel.VehicleDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, true);
        List<VehicleDetails> arrivals = new ArrayList<>();
        arrivals.addAll(createDummyVehicleDetails());
        ArrayAdapter<VehicleDetails> arrivalsAdapter = new ArrayAdapter<VehicleDetails>(getActivity(), R.layout.list_item_arrivals, R.id.listview_arrivals, arrivals);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_arrivals);
        listView.setAdapter(arrivalsAdapter);

        return rootView;
    }

    private Collection<VehicleDetails> createDummyVehicleDetails() {
        List<VehicleDetails> vehicles = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            vehicles.add(new VehicleDetails(i, "Some Destination " + i, System.nanoTime(), "BusId" + i, 1.1, 1.2, 20, false));
        }
        return vehicles;
    }


}
