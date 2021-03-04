package com.ebfstudio.footballeuse.ui.matchpreview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ebfstudio.footballeuse.databinding.FragmentMatchPreviewBinding
import com.ebfstudio.footballeuse.model.Competition
import com.ebfstudio.footballeuse.model.Match
import com.ebfstudio.footballeuse.model.Team
import com.ebfstudio.footballeuse.shared.util.autoCleared

/**
 * Created by Vince on 21/09/2020
 */
class MatchPreviewFragment : Fragment() {

    private var binding: FragmentMatchPreviewBinding by autoCleared()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val match = Match(
            teamHome = Team(name = "Lyon", logoUrl = "https://upload.wikimedia.org/wikipedia/fr/thumb/e/e2/Olympique_lyonnais_%28logo%29.svg/langfr-1280px-Olympique_lyonnais_%28logo%29.svg.png"),
            teamAway = Team(name = "Soyaux", logoUrl = "https://upload.wikimedia.org/wikipedia/fr/thumb/1/13/ASJ_Soyaux-Charente_%28logo%29.svg/langfr-1280px-ASJ_Soyaux-Charente_%28logo%29.svg.png"),
            scoreHome = 2,
            scoreAway = 1,
            stadium = "Stade Vélodrome",
            competition = Competition(name = "Divison 1", "https://upload.wikimedia.org/wikipedia/fr/2/27/D1_f%C3%A9minine_logo_2018.png")
        )

        binding = FragmentMatchPreviewBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        binding.match = match
        return binding.root
    }

}