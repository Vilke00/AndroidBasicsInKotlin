package com.example.androidbasicsinkotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidbasicsinkotlin.R
import com.example.androidbasicsinkotlin.data.DataSource
import com.example.androidbasicsinkotlin.model.Workout

class WorkoutAdapter(private val context: Context):RecyclerView.Adapter<WorkoutAdapter.WorkoutViewHolder>() {

    private val dataset:List<Workout> = DataSource.workouts

    class WorkoutViewHolder(private val view: View):RecyclerView.ViewHolder(view){
        val textViewName:TextView = view.findViewById(R.id.workout_name)
        val textViewEquipment:TextView = view.findViewById(R.id.equipment)
        val textViewMuscle:TextView = view.findViewById(R.id.muscle_worked)
        val textViewForce:TextView = view.findViewById(R.id.force)
        val textViewGrip:TextView = view.findViewById(R.id.grip)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return WorkoutViewHolder(adapterLayout)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: WorkoutViewHolder, position: Int) {
        val workout = dataset[position]
        val resources = context.resources

        holder.textViewName.text = resources.getString(R.string.workoutName ,workout.name)
        holder.textViewEquipment.text = resources.getString(R.string.workoutEquipment ,workout.equipment)
        holder.textViewMuscle.text = resources.getString(R.string.workoutMuscleWorked ,workout.primaryMuscleWorked)
        holder.textViewForce.text = resources.getString(R.string.workoutForce ,workout.force)
        holder.textViewGrip.text = resources.getString(R.string.workoutGrip ,workout.grip)
    }
}