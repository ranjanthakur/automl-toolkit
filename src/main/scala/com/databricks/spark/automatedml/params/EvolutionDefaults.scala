package com.databricks.spark.automatedml.params

trait EvolutionDefaults {

  final val allowableEvolutionStrategies = List("batch", "continuous")
  final val allowableOptimizationStrategies = List("minimize", "maximize")
  final val allowableMutationStrategies = List("linear", "fixed")
  final val allowableMutationMagnitudeMode = List("random", "fixed")
  final val regressionMetrics: List[String] = List("rmse", "mse", "r2", "mae")
  final val classificationMetrics: List[String] = List("f1", "weightedPrecision", "weightedRecall", "accuracy")
  final val allowableTrainSplitMethod: List[String] = List("random", "chronological", "stratified", "overSample",
    "underSample", "stratifyReduce")

  def _defaultLabel: String = "label"

  def _defaultFeature: String = "features"

  def _defaultTrainPortion: Double = 0.8

  def _defaultTrainSplitMethod: String = "random"

  def _defaultTrainSplitChronologicalColumn: String = "datetime"

  def _defaultTrainSplitChronologicalRandomPercentage: Double = 0.0

  def _defaultParallelism: Int = 20

  def _defaultKFold: Int = 3

  def _defaultSeed: Long = 42L

  def _defaultOptimizationStrategy: String = "maximize"

  def _defaultFirstGenerationGenePool: Int = 20

  def _defaultNumberOfMutationGenerations: Int = 10

  def _defaultNumberOfParentsToRetain: Int = 2

  def _defaultNumberOfMutationsPerGeneration: Int = 10

  def _defaultGeneticMixing: Double = 0.7

  def _defaultGenerationalMutationStrategy: String = "linear"

  def _defaultMutationMagnitudeMode: String = "random"

  def _defaultFixedMutationValue: Int = 1

  def _defaultEarlyStoppingScore: Double = 1.0

  def _defaultEarlyStoppingFlag: Boolean = true

  def _defaultEvolutionStrategy: String = "batch"

  def _defaultContinuousEvolutionMaxIterations: Int = 200

  def _defaultContinuousEvolutionStoppingScore: Double = 1.0

  def _defaultContinuousEvolutionParallelism: Int = 4

  def _defaultContinuousEvolutionMutationAggressiveness: Int = 3

  def _defaultContinuousEvolutionGeneticMixing: Double = 0.7

  def _defaultContinuousEvolutionRollingImprovementCount: Int = 20

  def _defaultDataReduce: Double = 0.5

}

