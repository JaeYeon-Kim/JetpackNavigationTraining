package com.example.android.navigation

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 프래그먼트에서 데이터 바인딩 개체 선언
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
                R.layout.fragment_title, container, false)
        binding.playButton.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(TitleFragmentDirections.actionTitleFragment2ToGameFragment()) }
        // 사용자가 메뉴 항목을 탭할때 동작을 구현하는 코드 추가
        setHasOptionsMenu(true)

        Log.i("TitleFragment", "onCreateView called")

        return binding.root
        }

    // 프래그먼트 수명 주기 메서드
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("TitleFragment", "onAttach called")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("TitleFragment", "onCreate called")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("TitleFragment", "onViewCreated called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("TitleFragment", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("TitleFragment", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TitleFragment", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("TitleFragment", "onStop called")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("TitleFragment", "onDestroyView called")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("TitleFragment", "onDetach called")
    }


    // 미리 만든 menu 리소스를 해당 메서드를 통해서 가져 온다.
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu, menu)

    }
    // 옵션 선택시 작업 수행을 위한 메서드
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.
                onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }

}