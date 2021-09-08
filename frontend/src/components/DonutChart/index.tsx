import Chart from 'react-apexcharts';

const DonutChart = () => {
    const mockData = {
        series: [5, 2, 4, 8, 7],
        labels: ['Cliente 1', 'Cliente 2', 'Cliente 3', 'Cliente 4', 'Cliente 5']
    }

    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart
            options={{ ...options, labels: mockData.labels }}
            series={mockData.series}
            type="donut"
            height="240"
        />
    );
}

export default DonutChart;